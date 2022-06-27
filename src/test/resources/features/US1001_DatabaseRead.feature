Feature: US1001 kullanici doru bilgilerle database baglanabilmeli
  @db
  Scenario: TC01 Kullanici database'deki bilgileri okur
    Given kullanici HMC veri tabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    #select price from thotelroom
    # "select"+str1+"from"+thotelroom
    And kullanici "Price" sutunundaki verileri okur