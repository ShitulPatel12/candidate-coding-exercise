**API TEST**

[thecatapi](https://docs.thecatapi.com/api-reference) is a free restful service that helps you to store and retrieve cat images.
* PROTOCOL: https://
* HOST: api.thecatapi.com
* VERSION: v1
* AUTHORIZATION:
  * Name: x-api-key
  * Value: DEMO-API-KEY

| Api              | Method | Description                                      |
| -----------------| ------ | -------------------------------------------------|
| /votes           | GET    | Returns all the Votes belonging to your Account  |
| /votes           | POST   | Vote an Image Up or Down                         |
| /votes/{vote_id} | GET    | Get one specific Vote belonging to your Account  |
| /votes/{vote_id} | DELETE | Delete a Vote from your Account                  |

**Exercise 1:**

Configure a basic HTTP client to be able to make REST call (You can setup python based framework/library)

**Requirement**

- Import necessary dependency library
- GET /votes` and store the response.
- Verify `200` response status code
- Verify response length more than 0.

**Objectives**

- Be able to configure and make an http request


**Exercise 2:**

Create a new vote `POST /votes`.

**Requirement**

- Verify `201` response status code,
- Verify response body match expected value `{"message": "SUCCESS"}`,
- Verify {id} in response is not empty and store the value.

**Objectives**
- POST


**Exercise 3:**

Use the *{id}* created at previous point to `GET /votes/{id}`.

**Requirement**

- Verify `200` response status code,
- *{id}* in response match *{id}* in request.

**Objectives**
- GET

***Bonus:***

**Exercise 4:**

Delete the vote at previous point `DELETE /votes/{vote_id}`

**Requirement**

- Verify `200` response status code,
- Verify response body match expected value `{"message": "SUCCESS"}`

**Objectives**

- DELETE

