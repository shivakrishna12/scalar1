This is sample Springboot CURD operation project, those who are beginners u can clone this project and start the practice 

Used Technologies
--------------------------
1.Java 8
2.Spring Boot
3.RestTemplate
4.IntelliJ IDE/Spring tool Suite

Postman Requests:
--------------------------
{
	"info": {
		"_postman_id": "b28b5ec8-a73f-428b-9fdb-e8532ae9314e",
		"name": "Scalar",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "1962826"
	},
	"item": [
		{
			"name": "http://localhost:8080/products/getProduct/1",
			"request": {
				"method": "GET",
				"header": [
					{
						"key": "Content-Type",
						"value": "text/xml",
						"type": "text"
					}
				],
				"url": {
					"raw": "http://localhost:8080/products/getAllProducts",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"products",
						"getAllProducts"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/products/getAllProducts",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n     \"title\": \"test product123\",\r\n      \"price\": 13.5,\r\n        \"description\": \"lorem ipsum set\",\r\n        \"imageUrl\": \"https://i.pravatar.cc\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/products/addNewProduct",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"products",
						"addNewProduct"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/categories/getAllCategories",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/categories/getAllCategories",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"categories",
						"getAllCategories"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/products/addNewProduct",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n     \"title\": \"test product123\",\r\n      \"price\": 13.5,\r\n        \"description\": \"lorem ipsum set\",\r\n        \"imageUrl\": \"https://i.pravatar.cc\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/products/addNewProduct",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"products",
						"addNewProduct"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/products/updateProduct/1",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n        \"id\": 1,\r\n        \"title\": \"Dell Laptop 5 series\",\r\n        \"price\": 109.95,\r\n        \"description\": \"Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday\",\r\n        \"imageUrl\": null\r\n    }",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/products/updateProduct/1",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"products",
						"updateProduct",
						"1"
					]
				}
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/products/productsInCategory/jewelery",
			"request": {
				"method": "GET",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"type": "text"
					}
				],
				"url": {
					"raw": "http://localhost:8080/products/productsInCategory/jewelery",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"products",
						"productsInCategory",
						"jewelery"
					]
				}
			},
			"response": []
		}
	]
}


