# osemes.javapro.dz32

Виконання ДЗ 32. Web Servlet

1. Реалізувати клас Order. Цей клас зберігатиме значення: id, date, cost, products
2. Реалізувати клас Product. Цей клас зберігатиме значення: id, name, cost
3. Замовлення зберігатимуться у спеціалізованому класі-репозиторії OrderRepository. 
3.1 Реалізувати метод отримання замовлення за id
3.2 Реалізувати метод отримання всіх замовлень
3.3 Реалізувати метод додавання замовлення
4. Реалізувати DispatcherServlet та зареєструвати його як бін. Сервлет має бути доступний за URL: http://localhost:8080
5. Реалізувати контролер Ping для перевірки того, що програма працює. Цей контролер має лише один спосіб і повертає повідомлення “ОК”.
5.1 Контролер доступний за URL: http://localhost:8080/ping
6. Реалізувати контролер взаємодії з ресурсом Order.
6.1 Контролер доступний за URL: http://localhost:8080/orders
6.2 Отримання конкретного замовлення
6.3 Отримання всіх замовлень
ВАЖЛИВО: Базу даних не потрібно підключати. OrderRepository буде зберігати певні дані.

=========================================

Пыд час виконання ДЗ я створив необхідні класи, реалізував DispatcherServlet та зареєструвати його як бін

Цей сервлет запускається під spring boot (чому spring boot -- тому що я мав великі проблеми із запуском tomcat, ссорі якщо що)
2023-09-28 09:23:01.592  INFO 3980 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2023-09-28 09:23:01.592  INFO 3980 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2023-09-28 09:23:01.593  INFO 3980 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms

Також у мене доступний сервлет на http://localhost:8080 
та коонтроллери за 
http://localhost:8080/ping 
http://localhost:8080/orders
