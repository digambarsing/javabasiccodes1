package HashMap;

public class HashinBasic {
//    What is Hashing in Java?
//
//    Hashing is a technique used in Java to map a large amount of data to a smaller, fixed-size value, known as a hash code. Hashing is used in various data structures, such as hash tables, sets, and maps, to store and retrieve data efficiently.
//
//    Key Terminology of Hashing in Java:
//
//    Here's a breakdown of the important terminology related to hashing in Java:
//
//            1. Hash Function:
//    A hash function is a mathematical function that takes an input (known as a key) and generates a fixed-size, unique output (known as a hash code). The hash function is designed to minimize collisions, where two different inputs produce the same output.
//
//2. Hash Code:
//    A hash code is the output of a hash function. It is a unique, fixed-size integer value that represents the input data. In Java, the hashCode() method is used to generate a hash code for an object.
//
//            3. Collision:
//    A collision occurs when two or more different inputs produce the same hash code. Collisions can lead to performance issues and data loss in hash-based data structures.
//
//4. Hash Table:
//    A hash table is a data structure that uses hashing to store and retrieve data. It consists of an array of slots, each of which can hold a key-value pair. The hash code of the key is used to determine the index at which the key-value pair is stored.
//
//            5. Bucket:
//    A bucket is a slot in a hash table where key-value pairs are stored. Each bucket can hold multiple key-value pairs, and the pairs are stored in a linked list.
//
//            6. Chaining:
//    Chaining is a technique used to handle collisions in hash tables. When a collision occurs, the colliding key-value pairs are stored in a linked list at the same index.
//
//            7. Open Addressing:
//    Open addressing is another technique used to handle collisions in hash tables. When a collision occurs, the hash table searches for an empty slot in the table to store the colliding key-value pair.
//
//            8. Load Factor:
//    The load factor is a measure of how full a hash table is. It is calculated as the ratio of the number of key-value pairs to the capacity of the hash table. When the load factor exceeds a certain threshold, the hash table is resized to accommodate more data.
//
//            9. Resizing:
//    Resizing occurs when a hash table needs to increase its capacity to accommodate more data. Resizing involves rehashing all the existing key-value pairs and storing them in the new, larger table.
//
//    Hashing in Java:


//    hashCode() and equals() Relationship: The hashCode() method and equals() method are related in the following way:
//    If two objects are equal according to equals(), they must have the same hash code.
//    If two objects have the same hash code, they may or may not be equal according to equals().



//
//    In Java, hashing is implemented using the hashCode() method, which is defined in the Object class. The hashCode() method returns an integer value that represents the object's hash code.
//
//    Here are some important points to note about hashing in Java:
//
//    Hash codes are not unique: While hash codes are designed to be unique, it is possible for two different objects to have the same hash code.
//    Hash codes are not stable: The hash code of an object can change between different runs of the program.
//    Hash codes are not secure: Hash codes are not suitable for cryptographic purposes, as they can be easily reversed-engineered.
}
