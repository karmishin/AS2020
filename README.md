# AtomSkills 2020. IT Solution for business

**Участник:** Кармишин Михаил Дмитриевич

# Проверяющим

**Что работает**: веб-часть, авторизация, управление пользователями

**Что не работает**: всё остальное

## Запуск

Требования:

* JDK 11+
* PostgreSQL

Как запускать:

1. Импорт БД

```bash
psql as2020 < release/as2020.sql
```

2. Запуск сервера

```bash
java -jar release/drontaxi-web-0.0.1-SNAPSHOT.jar
```

3. Зайти на [localhost:8080](http://localhost:8080) и авторизоваться. 

Пользователи | Логин | Пароль 
-------------| ----- | ------
Обычный | user | user 
Администратор | admin | admin

*Пользователь PostgreSQL: user1;donthackme*
