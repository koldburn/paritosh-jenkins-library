#! /bin/bash

def call(Map config = [:]){
    echo "hello ${config.name}, from ${config.city}, this is $[config.day}"
}
