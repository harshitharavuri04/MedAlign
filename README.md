Communication Service (Secure Messaging)
•	Responsibilities: Enables secure communication between providers and patients, including messaging and notifications.
•	Key Entities: Message, Conversation, Notification.
•	Endpoints:
o	POST /messages
o	GET /messages/conversations/{conversationId}
o	POST /notifications
•	Technology Stack: Spring Boot, WebSockets (for real-time communication), MYSQL.

message.json:


{
  "id": 1,
  "content": "Hello, this is a test message.",
  "senderId": 1,
  "receiverId": 2,
  "conversationId": 1,
  "timestamp": "2024-09-10T14:30:00Z"
}



notification.json:

{
  "id": 1,
  "recipientId": 1,
  "message": "You have a new message from user 2.",
  "timestamp": "2024-09-10T14:45:00Z"
}
