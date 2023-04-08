# Bank Accounts Micro Service


## Adding Important Dependencies
Web, Spring Data JPA, H2, Lombok

```bash
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-rest</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-graphql</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
</dependency> 
```


## Creating the Spring Main Layers : DAO, WEB, Service

![image](https://user-images.githubusercontent.com/122738653/230724827-4b93472a-9026-4880-b53b-93e0072bf7a2.png)


## Test The Micro Service with POSTMAN 

### GET Method 
We list the 10 randomly added bank accounts

![2](https://user-images.githubusercontent.com/122738653/230725113-58181739-4dfc-46c9-b3d3-1b4a7f5c078a.png)


### POST Method 
We add a Bank Account.

![1](https://user-images.githubusercontent.com/122738653/230725085-e61acb7e-5bfa-4687-b85f-27dec751913a.png)


## Adding the DTO and Mapper 

### DTO  
It is basically used to pass data with multiple attributes in one shot from client to server, to avoid multiple calls to a remote server.

![image](https://user-images.githubusercontent.com/122738653/230725383-6000e754-bdd9-4aff-8688-f2ffbf7ca296.png)

### Mapper  
It allows us to map our domain model directly to the database structure and then giving us the flexibility of only manipulating objects in our code.

![image](https://user-images.githubusercontent.com/122738653/230725795-7844180e-fbff-40c7-be67-7775fee0f100.png)

## Testing 
We search by the type SAVING_ACCOUNT using the method ByType which we have defined in our repository.

![bytype](https://user-images.githubusercontent.com/122738653/230725905-6d3c5f7e-96f7-468a-8af1-53a8808c74aa.png)

