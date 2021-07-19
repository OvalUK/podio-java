package com.podio.search;

public class Counts {
    
	private Long item;
        
	private Long task;
        
	private Long conversation;
        
	private Long app;
        
	private Long status;
        
	private Long file;
        
	private Long profile;

        public Long getItem() {
                return item;
        }

        public void setItem(Long item) {
                this.item = item;
        }

        public Long getTask() {
                return task;
        }

        public void setTask(Long task) {
                this.task = task;
        }

        public Long getConversation() {
                return conversation;
        }

        public void setConversation(Long conversation) {
                this.conversation = conversation;
        }

        public Long getApp() {
                return app;
        }

        public void setApp(Long app) {
                this.app = app;
        }

        public Long getStatus() {
                return status;
        }

        public void setStatus(Long status) {
                this.status = status;
        }

        public Long getFile() {
                return file;
        }

        public void setFile(Long file) {
                this.file = file;
        }

        public Long getProfile() {
                return profile;
        }

        public void setProfile(Long profile) {
                this.profile = profile;
        }

        @Override
        public String toString() {
                return "Counts[item=" + item + ", task=" + task + ", conversation=" + 
                        conversation + ", app=" + app + ", status=" + status + ", file=" + 
                        file + ", profile=" + profile + ']';
        }
        
}
