# language: ru
# encoding:UTF-8

  @test @website
Функционал: Проверка открытия страницы
    Сценарий: Проверка ,что после введенного логина и пароля открывается страница "https://www.saucedemo.com/inventory.html/"
    Допустим открыта страница "https://www.saucedemo.com/"
    И в поле с логином введен логин "standard_user"
    И в поле с паролем введен пароль "secret_sauce"
    И нажата кнопка "LOGIN"
    Тогда открыта страница "https://www.saucedemo.com/inventory.html/"




