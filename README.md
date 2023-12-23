# Spring Data Solr Project

A Simple Spring Boot project that retrieves data from Solr based on a long-type variable,  fetching records the entered day to today and adding new data.

## 1. Download and Install Solr

Download the latest version of Solr from the [official website](http://lucene.apache.org/solr/). Once downloaded, extract the contents to a directory of your choice.

## 2. Navigate to Solr Installation Directory

Open a terminal or command prompt and navigate to the Solr installation directory.
```bash
path/to/solr/bin
```
## 3. Start Solr in Local Mode
Start Solr in local mode by running the following command:
```bash
./solr start
```
## 4.Create a New Solr Core
```bash
bin/solr create -c products
```
## REST API Endpoints

### 1. Create Product

- **Endpoint:** `POST /products/add`
- **Description:** Adds a new product.
- **Request Body:** JSON object with product details (e.g., {"id": "ProductId", "updatedAt": 1577836800000})
- **Success Response:** `200 OK`, Product added successfully.

### 2. Get Products Updated After Time

- **Endpoint:** `GET /products/updatedAfterTime`
- **Description:** Retrieves products updated after a specific timestamp.
- **Query Parameter:** - `timestamp` (long): Timestamp to filter products. (e.g.,http://localhost:8080/products/updatedAfterTime?timestamp=1577836800000)
- **Success Response:** `200 OK`, List of products updated after the specified time.
