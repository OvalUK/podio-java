package com.podio.space;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.podio.BaseAPI;
import com.podio.common.Role;
import com.podio.user.UserMini;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

public class SpaceAPI {

	private final BaseAPI baseAPI;

	public SpaceAPI(BaseAPI baseAPI) {
		this.baseAPI = baseAPI;
	}

	/**
	 * Add a new space to an organization.
	 * 
	 * @param data
	 *            The data for the new space
	 * @return The data about the new created space
	 */
	public SpaceCreateResponse createSpace(SpaceCreate data) {
		return baseAPI.getApiResource("/space/")
				.entity(data, MediaType.APPLICATION_JSON_TYPE)
				.post(SpaceCreateResponse.class);
	}

	/**
	 * Get the space with the given id
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @return The space with the given id
	 */
	public Space getSpace(int spaceId) {
		return baseAPI.getApiResource("/space/" + spaceId)
				.accept(MediaType.APPLICATION_JSON_TYPE).get(Space.class);
	}

	/**
	 * Updates the space with the given id
	 * 
	 * @param spaceId
	 *            The id of the space to update
	 * @param data
	 *            The updated data of the space
	 */
	public void updateSpace(int spaceId, SpaceUpdate data) {
		baseAPI.getApiResource("/space/" + spaceId)
				.entity(data, MediaType.APPLICATION_JSON_TYPE).put();
	}

	/**
	 * Deletes the space with the given id. This will also end all memberships
	 * of the space and cancel any space invites still outstanding.
	 * 
	 * @param spaceId
	 *            The id of the space
	 */
	public void deleteSpace(int spaceId) {
		baseAPI.getApiResource("/space/" + spaceId)
				.accept(MediaType.APPLICATION_JSON_TYPE).delete();
	}

	/**
	 * Returns the space and organization with the given full URL.
	 * 
	 * @param url
	 *            The full URL of the space
	 * @return The space with organization
	 */
	public SpaceWithOrganization getSpaceByURL(String url) {
		return baseAPI.getApiResource("/space/url").queryParam("url", url)
				.accept(MediaType.APPLICATION_JSON_TYPE)
				.get(SpaceWithOrganization.class);
	}

	/**
	 * Invites a list of users (either through user_id or email) to the space.
	 * If the user limit is reached, status code 403 will be returned.
	 * 
	 * @param invitation
	 *            The data of the invitations
	 */
	public void inviteToSpace(int spaceId, SpaceInvitation invitation) {
		baseAPI.getApiResource("/space/" + spaceId + "/invite")
				.entity(invitation, MediaType.APPLICATION_JSON_TYPE).post();
	}

	/**
	 * Resends the space invite with a new subject and message.
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @param userId
	 *            The id of the user
	 * @param update
	 *            The updated invitation
	 */
	public void resendInvitation(int spaceId, int userId,
			SpaceInvitationUpdate update) {
		baseAPI.getApiResource(
				"/space/" + spaceId + "/member/" + userId + "/resend_invite")
				.entity(update, MediaType.APPLICATION_JSON_TYPE).post();
	}

	/**
	 * Returns the statistics for the space with the number of members,
	 * statuses, items and comments.
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @return The statistics for the space
	 */
	public SpaceStatistics getSpaceStatistics(int spaceId) {
		return baseAPI.getApiResource("/space/" + spaceId + "/statistics")
				.accept(MediaType.APPLICATION_JSON_TYPE)
				.get(SpaceStatistics.class);
	}

	/**
	 * Used to get the details of an active users membership of a space.
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @param userId
	 *            The ud of the user
	 * @return The details about the space membership
	 */
	public SpaceMember getSpaceMembership(int spaceId, int userId) {
		return baseAPI
				.getApiResource("/space/" + spaceId + "/member/" + userId)
				.accept(MediaType.APPLICATION_JSON_TYPE).get(SpaceMember.class);
	}

	/**
	 * Updates a space membership with another role
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @param userId
	 *            The id of the user
	 * @param role
	 *            The new role for the membership
	 */
	public void updateSpaceMembership(int spaceId, int userId, Role role) {
		baseAPI.getApiResource("/space/" + spaceId + "/member/" + userId)
				.entity(new SpaceMemberUpdate(role),
						MediaType.APPLICATION_JSON_TYPE).put();
	}

	/**
	 * Ends the users membership on the space, can also be called for members in
	 * state invited.
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @param userId
	 *            The id of the user
	 */
	public void endSpaceMembership(int spaceId, int userId) {
		baseAPI.getApiResource("/space/" + spaceId + "/member/" + userId)
				.accept(MediaType.APPLICATION_JSON_TYPE).delete();
	}

	/**
	 * Returns the active members of the given space.
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @return The active members of the space
	 */
	public List<SpaceMember> getActiveMembers(int spaceId) {
		return baseAPI.getApiResource("/space/" + spaceId + "/member/")
				.accept(MediaType.APPLICATION_JSON_TYPE)
				.get(new GenericType<List<SpaceMember>>() {
				});
	}

	/**
	 * Returns the members that was invited to the space, but has not yet
	 * accepted or declined.
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @return The active members of the space
	 */
	public List<SpaceMember> getInvitedMembers(int spaceId) {
		return baseAPI.getApiResource("/space/" + spaceId + "/member/invited/")
				.accept(MediaType.APPLICATION_JSON_TYPE)
				.get(new GenericType<List<SpaceMember>>() {
				});
	}

	/**
	 * Returns a list of the members that have been removed from the space.
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @return The active members of the space
	 */
	public List<SpaceMember> getEndedMembers(int spaceId) {
		return baseAPI.getApiResource("/space/" + spaceId + "/member/ended/")
				.accept(MediaType.APPLICATION_JSON_TYPE)
				.get(new GenericType<List<SpaceMember>>() {
				});
	}

	/**
	 * Returns the top most active members of the space.
	 * 
	 * @param spaceId
	 *            The id of the space
	 * @param limit
	 *            The max number of members to return, defaults to 6
	 * @return The top users for the space
	 */
	public List<UserMini> getTopUsers(int spaceId, Integer limit) {
		WebResource resource = baseAPI.getApiResource("/space/" + spaceId
				+ "/member/top/");
		if (limit != null) {
			resource = resource.queryParam("limit", limit.toString());
		}

		return resource.accept(MediaType.APPLICATION_JSON_TYPE).get(
				new GenericType<List<UserMini>>() {
				});
	}

	/**
	 * Returns the top spaces for the user
	 * 
	 * @param limit
	 *            The max number of members to return, defaults to 6
	 * @return The top spaces for the user
	 */
	public List<SpaceWithOrganization> getTopSpaces(Integer limit) {
		WebResource resource = baseAPI.getApiResource("/space/top/");
		if (limit != null) {
			resource = resource.queryParam("limit", limit.toString());
		}

		return resource.accept(MediaType.APPLICATION_JSON_TYPE).get(
				new GenericType<List<SpaceWithOrganization>>() {
				});
	}
}
