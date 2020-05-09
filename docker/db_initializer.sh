#!/bin/bash

docker exec -i mysql-forum mysql -u root --password=secret forum < db_tables/user.sql
