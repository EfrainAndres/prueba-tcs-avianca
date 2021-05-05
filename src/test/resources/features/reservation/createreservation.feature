Feature: Reserva de viaje

  Scenario: Reserva de viaje de ida
    Given "Efrain" ingresa a la pagina de avianca "https://www.avianca.com/co/es/"
    When el va a la seccion de Reserva tu vuelo y selecciona "Solo Ida"
    Then el selecciona el origen del vuelo "Bogota"
    And el selecciona el destino del vuelo "Medellin"
    And el selecciona la fecha del dia actual
    And el selecciona que viajara 1 Adultos, 1 Nino y 1 Bebe
    When el da clic en el boton "Buscar vuelos"
    Then el debe visualizar la seleccion de la tarifa