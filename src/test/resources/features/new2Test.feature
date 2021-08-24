# language: ru
# encoding:UTF-8

@test @container
Функционал: Проверка наличия в корзине покупки
  Сценарий: Проверка ,что после того как положили в корзину вещь, она лежит там
    Допустим открыта страница "https://www.saucedemo.com/"
    И в поле с логином введен логин "standard_user"
    И в поле с паролем введен пароль "secret_sauce"
    И нажата кнопка "LOGIN"
    И открыта страница "https://www.saucedemo.com/inventory.html/"
    И нажали на кнопку добавления вещи в корзину "ADD TO CART"
    И открыта страница "https://www.saucedemo.com/cart.html"
    Тогда найденная вещь "Sauce Labs Backpack" лежит в корзине
