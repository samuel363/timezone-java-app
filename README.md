## Requerimentos

```bash
apache maven
java version 1.8
```

## Despliegue

```
--mvn clean
--mvn install
--mvn spring-boot:run
```

## Ruta:

**POST**
http://localhost:8081/changeTime

## Parametros:
	hour
	timezone

## Ejemplos:

### Entrada:
{ "hour": "18:31:45", "timezone": "-3" }

###	Salida:
{
	"response":{
		"time":"21:31:45",
		"timezone":"utc"
	}
}

## NOTA:
"timezone" puede ser un numero o una zona horaria,
ejemplo: America/Caracas