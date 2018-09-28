Feature: DetalhesdoCNPJ.feature

  @scenario01
  Scenario Outline: Validar Detalhes do CNPJ
    Given I set header "Authorization" as "Bearer eyJhbGciOiJSUzUxMiJ9.ew0KICAianRpIjogIjllNzRkMWY2LTcwOTUtNDcxOC04ZjExLTQ3ZGM5ZWM5OWM2MyIsDQogICJpYXQiOiAxNTI3NjE1NzQwLA0KICAic2NvcGUiOiBbDQogICAgInJlYWQiLA0KICAgICJ3cml0ZSINCiAgXSwNCiAgInVzZXJfaWQiOiAiNWIwMzQ4ZDE4ZTc0ZGIwMDA4ZmI5YTc4IiwNCiAgImNsaWVudF9pZCI6ICI1YjA0MmZiNzNkN2ExNzAwMDk1NzJiYTciLA0KICAiYXBwX2lkIjogIjViMDQyY2Q1OGU3NGRiMDAwOGZiOWI0NyIsDQogICJzZXJ2aWNlX2lkIjogIjViMDQyZmI2OGU3NGRiMDAwOGZiOWI1MyIsDQogICJhdXRob3JpdGllcyI6IFsNCiAgICAiUk9MRV9DTEktQVVUSC1JREVOVElGSUVEIiwNCiAgICAiUk9MRV9DTEktMVNUUEFSVFkiLA0KICAgICJST0xFX0NMSS1BVVRILUJBU0lDIiwNCiAgICAiUk9MRV9DTEktM1JEUEFSVFkiLA0KICAgIA0KICAgICJST0xFX0FVVEgtTUZBIiwNCiAgICAiUk9MRV9BVVRILUJBU0lDIiwNCiAgICAiUk9MRV9BVVRILUlERU5USUZJRUQiLA0KICAgICJST0xFX1NFQ0FETUlOIiwNCiAgICAiUk9MRV9BRE1JTiIsDQogICAgIlJPTEVfVVNFUiIsDQogICAgIlJPTEVfUEVSU09OIg0KICBdLA0KICAiZXhwIjogMTU1OTE1NTc0MA0KfQ.m4sse9KGzl1rara5VcgFJcktk7-3qH0SzhJQ2IQPAfxbFP_mmduJ3EkJkQ8zxtxoNlrP85gOcacFNQJio5HffEtlDjlHXmZo1kkxYFobwgAZB5iVS0UEPylreWJYIqVTaR6gUaxfuEu76wbjfmE0gUlSqy0cLQpRy-idq0nOnPb2g4p-jCnkwqQGCTheES2s86mjhWFjFmmEc2KaqsvqCU9AxnjLc_3y3tgvbuQGnsiRK22S1_3PI2qpao3WLVzV16f3PB2i2y6kcgFXqjUoNwVcXO2fBwJ8yMFs7BWKhW9NgXcLn5AWrWrxJeWO0jHVWwnfA6Hf-V1uKWGSSj-Jlg"
    Given I use the route "/self-service/customer/v1/customers?ip=54.76.98.1928&documentBase=<DocumentBase>&customerType<CustomerType>"
    When I send the GET request
    Then I print the response
    Then Http response should be 200
    Then I validate api Detalhes do CNPJ "<Nome>" "<CNPJ>"
    Then I validate api Detalhes do CNPJ "<Nome2>" "<CNPJ2>"
    Then I validate api Detalhes do CNPJ "<Nome3>" "<CNPJ3>"
    Then I validate api Detalhes do CNPJ "<Nome4>" "<CNPJ4>"
    Then I validate api Detalhes do CNPJ "<Nome5>" "<CNPJ5>"

    Examples: 
      | DocumentBase   | CustomerType | Nome  | CNPJ2          | CNPJ3          | CNPJ4          | CNPJ5          |
      | 00000802000100 |              | TODOS | 00000802000282 | 00000802000606 | 00000802001092 | 00000802001416 |