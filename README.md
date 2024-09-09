in the resources/applications.properties 

change
spring.datasource.url=jdbc:mysql://localhost:3306/ur database name
spring.datasource.username=root
spring.datasource.password=ur mysql password

this branch has the backend code for creating , updating , deleting and getting data for patients.

example json format:
{
    "firstName": "karthik",
    "lastName": "ram",
    "dob": "1990-01-15",
    "gender": "Male",
    "demographics": {
        "address": "123 Main St",   
        "city": "Springfield",
        "state": "IL",
        "zipCode": "62701"
    },
    "insuranceInformation": {
        "provider": "HealthCare Inc.",
        "policyNumber": "H123456789"
    }
}
