package com.kaushik.algorithmutility.entities;

public class TreeProcessingException extends RuntimeException {
	
		private String detailedMessage;
		
		public String getDetailedMessage() {
			return detailedMessage;
		}

		public void setDetailedMessage(String detailedMessage) {
			this.detailedMessage = detailedMessage;
		}

		public Exception getRootException() {
			return rootException;
		}

		public void setRootException(Exception rootException) {
			this.rootException = rootException;
		}

		private Exception rootException;
	
		public TreeProcessingException(Exception rootException, String detailedMessage){
				this.detailedMessage = detailedMessage;
				this.rootException = rootException;
		}
		
		public TreeProcessingException(String detailedMessage){
			this(null,detailedMessage);
		}
}
