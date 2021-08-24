#language:ru
#encoding:UTF-8

@test @things
Функционал: Параметризированный запуск тестов

  Структура сценария: Проверка цены вещи <thingName>
    Допустим открыта страница "https://www.saucedemo.com/"
    И в поле с логином введен логин "standard_user"
    И в поле с паролем введен пароль "secret_sauce"
    И нажата кнопка "LOGIN"
    И открыта страница "https://www.saucedemo.com/inventory.html/"
    И выполнено нажатие на ссылку "<thingName>"
    Тогда цена вещи равна "<thingPrice>"

    Примеры:
      | thingName             | thingPrice |
      | Sauce Labs Backpack   | $ 29.99    |
      | Sauce Labs Onesie     | $7.99      |
      | Sauce Labs Bike Light | $9.99      |