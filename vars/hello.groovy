#! /bin/bash

def call(Map config = [:]) {
  echo "Hello ${config.name} of ${config.city}. It is ${config.dayOfWeek}."
}
