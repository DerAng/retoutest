#Autor: Derly Angel


  @stories
  Feature: uTest platform

  As a user unregistered, I want to register on the uTest platform


    @scenario1

    Scenario Outline: Registry on the uTest platform


      Given that Rose want to subscribe to the uTest platform

      When she fill out the registration form

        | firstName      |  lastName       | email       |   dateOfBirth        | city           |   postalCode    |  country      |   computer    | version         |   lenguage     | password            |   confirmPassword    |
        | <firstName>    |  <lastName>     | <email>     |   <dateOfBirth>      | <city>         |  <postalCode>   |  <country>    |  <computer>   | <version>       |   <lenguage>   | <password>          |   <confirmPassword>  |


      Then finds the message called The Last Step


      Examples:

        | firstName      |  lastName       | email                   |    dateOfBirth           | city             |   postalCode    |  country       |   computer    | version         |   lenguage     | password             |   confirmPassword    |
        | Ana            |  Medina         | anamedinavill@gmail.com |   August-12-1994         | Bogota           |   123           |  Colombia      |   Windows     | XP              |   Spanish      | AnaMedina12345621    |   AnaMedina12345621  |





