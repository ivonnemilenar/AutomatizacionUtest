# Autor: Ivone Rodriguez

@Stories
Feature: User registration on the Utest page

  @scenario1
  Scenario: Ivonne registration on the Utest page
    Given Ivonne wants to register on the Utest page
    When enter all required information
      | strFirsName | strLastName | strEmail                | strBirthMonth | strBirthDay | strBirthYeard | strCity  | strPostalCode | strCountry | strComputer | strVersionComputer | strLenguageComputer | strMobileDevice | strDiviceModel | strOperatingSystem | strPassword   |
      | Ivonne      | Romero      | ivonnemilenar@gmail.com | October       | 1           | 1980          | Medellín | 050030        | Colombia   | Windows     | 10                 | Spanish             | Apple           | iPhone 11      | iOS 13             | Ivonne2022* |
    Then registration is completed successfully