# Spring Boot AWS Secrets Manager

An example of Spring Boot application that connects to AWS Secrets Manager to get database credentials.

Read this blog post for more details.
- [Getting database credentials from AWS Secrets Manager in Spring Boot](https://www.geekyhacker.com/2020/05/09/getting-database-credentials-from-aws-secrets-manager-in-spring-boot/)

## How to run

### Create an AWS Secret

Create an AWS Secret from your AWS Management Console, name it as `local-test`.

If you don't know how to that, read [this article](https://www.geekyhacker.com/2020/05/08/getting-started-with-aws-secret-manager/).

If you already have the secret but with a different name, make sure to edit `application.properties`, and change `spring.datasource.username` field.

### Export AWS ACCESS KEY and ID as environment variables

Need to export the following environment variables in the same console that you run the application,

```bash
$ export AWS_ACCESS_KEY_ID=YOUR_ACCESS_KEY
$ export AWS_SECRET_ACCESS_KEY=YOUR_SECRET_KEY
$ export AWS_REGION=YOUR_ACCOUNT_REGION
```

### Bring up docker and create table

```bash
$ cd docker && docker-compose up -d
$ ./db_initializer.sh
```

### Run the application

```bash
$ ./mvnw spring-boot:run
```

## Test it!

Open your browser and hit `localhost:8080/v1/users/`. You should see JSON output.

## Custom values

To change any values like database name, port, host or even the secret name, either change the application properties or export the environment variables.
