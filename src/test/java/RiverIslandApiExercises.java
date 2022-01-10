import org.junit.Test;

/**
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

*/

public class RiverIslandApiExercises {

 @Test public void test1() {
     /**
     * Exercise 1: Configure a basic HTTP client to be able to make REST call (you can setup restassured ar any other desired library
     *
     * Requirement
     *      * Update gradle file with appropriate dependency
            * Import necessary dependency library
            * `GET /votes` and store the response.
              * Create an object to unmarshal the result in it.
              * Verify `200` response status code
              * Verify response length more than 0.
       Objectives 
	    * Be able to configure and make an http request
     */
 }

 @Test public void test2() {
      /**
      * Exercise 2: Create a new vote `POST /votes`.
      *
      * Requirement
      *      * Verify `200` response status code,
             * Verify response body match expected value `{"message": "SUCCESS"}`,
             * Verify {id} in response is not empty and store the value.
        Objectives
         * POST
      */
 }

  @Test public void test3() {
    /**
    * Exercise 3: Use the *{id}* created at previous point to `GET /votes/{id}`.
    *
    * Requirement
    *      * Verify `200` response status code,
           * *{id}* in response match *{id}* in request.
      Objectives
       * GET
    */
  }

  @Test public void test4() {
      /**
      * Exercise 4: Delete the vote at previous point `DELETE /votes/{vote_id}`

      *
      * Requirement
      *      * Verify `200` response status code,
             * Verify response body match expected value `{"message": "SUCCESS"}`,
        Objectives
         * DELETE
      */
  }
}


