package com.github.maiflai.utils

class Handle<T> {
    private T value

    Handle(T value) { this.value = value }
    void put(T value) { this.value = value }
    T get() { return this.value }

    @Override
    String toString() { return "Handle[${value.toString()}]" }
}
