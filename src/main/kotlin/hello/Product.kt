package hello

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Product(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1)