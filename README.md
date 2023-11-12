# Pedro Avila `23089`

# Analisis

## Controller
- `Login Manager`:
  - Metodos:
    - Login: Logea dependiedo que tipo de usuario es (Esntadar o Premiun)
    - ChangeUser: Cambia el tipo de usuario
- `Register Manager`:
  - Metodos:
    - RegisterPremiun: Registra un usuario premiun y abre su vista
    - RegisterEstandar: Registra un usuario estandar y abre su vista

## Model
### BasicObjects
- `Bibli`:
  - Atributos
    - Titulo:string
    - Precio:float
  - Metodos:
    - GetTitle: Retorna el titulo del libro
    - GetPrice: Retorna el precio del libro
- `Book`:
  - Atributos
    - Autor:string
    - Editorial:string
  - Metodos:
    - GetAuthor: Retorna el autor del libro
    - GetEditorial: Retorna la editorial del libro
    - toString: Retorna un string concatenado bonito
- `Magazine`:
  - Atributos:
    - edition:autor
    - editorial:string
  - Metodos:
    - GetEdition: Retorna la edicion de la revista
    - GetEditorial: Retorna la editorial de la revista
    - toString: Retorna un string concatenado bonito
- `User`:
  - Atributos:
    - Name:string
    - BibliList:Hastable<String, Arraylist>
    - CuantosDias:int
    - password:string
  - Metodo:
    - GetName: Retorna el nombre del usuario
    - GetBibliList: Retorna la lista de bibliografias del usuario
    - GetCuantosDias: Retorna los dias que el usuario tiene para devolver el libro
    - GetPassword: Retorna la contraseña del usuario
    - SetPassword: Cambia la contra del usuario
    - EmptyBibliList: Vacia la lista de bibliografias del usuario
    - AddMagazine: Agrega una bibliografia a la lista del usuario
- `Premiun` extends User implements IBasicObjects:
  - Atributos:
    - HoraDeEntrega:string
    - Domiciolio:String
    - Cupon:boolean    
  - Metodo:
    - SetHoraDeEntrega: Cambia la hora de entrega del usuario
    - SetDomicilio: Cambia el domicilio del usuario
    - ApplyCupon: Pone el cupon del usuario en true
    - AddBook(Book): Agrega un libro a la lista de bibliografias del usuario
    - ShowList: Muestra la lista de bibliografias del usuario
- `Estandar` extends User implements IBasicObjects:
  - Atributos:
    - Hour12Later:boolean
    - Sucursal:String
  - Metodo:
    - SetHoraDeEntrega: Cambia la hora de entrega del usuario
    - SetDomicilio: Cambia el domicilio del usuario
    - ApplyCupon: Pone el cupon del usuario en true
    - AddBook(Book): Agrega un libro a la lista de bibliografias del usuario
    - ShowList: Muestra la lista de bibliografias del usuario
#### IBasicObjects
**Son interfaces**
- `BorrowingManager`:
  - ShowList: Muestra la lista de bibliografias del usuario
- `ItemsManager`:
  - AddBook: Agrega un libro a la lista de bibliografias del usuario
### FileManagers
- `CsvManager` ectends IFileManager:
  - Atributos:
    - Path:string
  - Metodos:
    - LoadUser: Lee el archivo csv
    - SaveUser: Escribe en el archivo csv
- `IFileManager`:
  - Metodos:
    - LoadUser: Lee el archivo
    - SaveUser: Escribe en el archivo

## View
- `MainUI`:
  - Atributos:
    - CsvManager:CsvManager
    - ArrayList<Users>:Usuarios
  - Metodos:
    - View: Muetsra la vista
### ProfileView:
- `PremiunView`:
  - Atributos:
    - Premiun:Premiun
    - MainUI:MainUI
  - Metodos:
    - View: Muetsra la vista
    - ModoPrestamo: Cambia la vista a mostrar solo cosas de prestamos
    - ModoSeleccion: Para poder elegir diferentes bibliografias
- `EstandarView`:
- Atributos:
    - Estandar:Estandar
    - MainUI:MainUI
  - Metodos:
    - View: Muetsra la vista
    - ModoPrestamo: Cambia la vista a mostrar solo cosas de prestamos
    - ModoSeleccion: Para poder elegir diferentes bibliografias
#### IProfileView:
- `IUserView`:
  - Metodos
    - View: Muetsra la vista
    - ModoPrestamo: Cambia la vista a mostrar solo cosas de prestamos
    - ModoSeleccion: Para poder elegir diferentes bibliografias

# UML

![UML](tasks\UML.png)

# GitRepo

[GitRepo](https://github.com/AlejandroJavierGarciaGarcia/POO_2023_Laboratorio4/tree/PedroAvila-23089)

# UML Link
[UML](https://lucid.app/lucidchart/db8fceba-50de-424d-b701-bfc3ff920c7c/edit?invitationId=inv_16c488b5-d813-4fde-ba89-82d59f564eab&page=0_0#)