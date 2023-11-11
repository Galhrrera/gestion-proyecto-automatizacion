Feature: Successful Registration

  Scenario: Successful registration
    Given The browser opens the web page
    And The user selects the login option
    When The user clicks "Register Now!"
    And The user enters User ID as "UsuarioPrueba001"
    And The user enters the password "@UnaClav3"
    And The user re-enters the password "@UnaClav3"
    And The user enters the first name "Nombre_prueba"
    And The user enters the last name "Apellido_prueba"
    And The user enters the email "email.prueba@test.co"
    And The user enters the phone "3003003030"
    And The user enters address line  "Carrera 1 1 1"
    And The user enters the city "Medellin"
    And The user enters the state "Antioquia"
    And The user enters the ZIP code "050000"
    And The user enters the country "Colombia"
    And The user clicks on Save Account Information
    Then The registration is successful and You are redirected to the main page

