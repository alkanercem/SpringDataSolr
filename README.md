# Spring Data Solr Project

A Simple Spring Boot project that retrieves data from Solr based on a long-type variable,  fetching records the entered day to today and adding new data.

## 1. Download and Install Solr

Download the latest version of Solr from the [official website](http://lucene.apache.org/solr/). Once downloaded, extract the contents to a directory of your choice.

## 2. Navigate to Solr Installation Directory

Open a terminal or command prompt and navigate to the Solr installation directory.

**```bash
path/to/solr/bin

## 3. Start Solr in Local Mode
Start Solr in local mode by running the following command:

**```bash
./solr start

## 4.Create a New Solr Core

**```bash
bin/solr create -c products

# API Endpoints

## Get Products Updated After Time
Retrieve a list of products updated after a specific timestamp.

URL: /products/updatedAfterTime
Method: GET
Query Parameter:
timestamp (long): The timestamp to filter products.

## Add Product
Add a new product.

URL: /products/add
Method: POST
Request Body:
```json
{
  "id": "ProductId",
  "updatedAt": 1641674941000
}
