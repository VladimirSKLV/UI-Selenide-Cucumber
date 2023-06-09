Feature: Авторизация пользователя на сайте
  Я, как пользователь, хочу авторизоваться на сайте,
  чтобы иметь доступ к своему профилю и выполнить необходимые действия.

  Scenario: Авторизация пользователя с правильными данными
    Given Я открываю страницу сайта
    When Я ввожу свои учетные данные
    And Я нажимаю на кнопку входа
    Then Я попадаю на страницу профиля
    And Я получаю статус 200
