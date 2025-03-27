

### **1. Student Management System**
**Objective**: CRUD operations for students, courses, and enrollments.  
**Hibernate Features**:  
- One-to-Many (Student → Courses)  
- Many-to-Many (Courses ↔ Students)  
- HQL (Hibernate Query Language)  

**Example Code**:
```java
@Entity
public class Student {
    @Id @GeneratedValue
    private Long id;
    private String name;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Course> courses = new HashSet<>();
}
```

**Problem**: LazyInitializationException when accessing unloaded collections.  
**Solution**: Use `JOIN FETCH` in HQL or enable OpenSessionInView.

---

### **2. Inventory Management System**
**Objective**: Track products, categories, and suppliers.  
**Hibernate Features**:  
- Many-to-One (Product → Category)  
- Criteria API for filtering products  
- Second-level caching  

**Example Code**:
```java
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
public class Product {
    @ManyToOne
    private Category category;
}
```

**Problem**: Cache inconsistency after updates.  
**Solution**: Use `session.refresh()` or configure cache expiration.

---

### **3. Library Management System**
**Objective**: Manage books, borrowers, and checkouts.  
**Hibernate Features**:  
- Transactions with `@Transactional`  
- Optimistic locking with `@Version`  
- Inheritance (Book → Fiction/NonFiction)  

**Example Code**:
```java
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Book { ... }
```

**Problem**: Concurrent updates causing stale data.  
**Solution**: Implement optimistic locking using `@Version`.

---

### **4. Employee-Department Relationship**
**Objective**: Track employees and departments.  
**Hibernate Features**:  
- Bidirectional One-to-Many (Department ↔ Employee)  
- Named Queries  
- Pagination with `setFirstResult()` and `setMaxResults()`  

**Example Code**:
```java
@Entity
public class Department {
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
```

**Problem**: Orphaned child records when deleting a parent.  
**Solution**: Use `orphanRemoval = true` in `@OneToMany`.

---

### **5. Online Quiz Application**
**Objective**: Create quizzes with questions and answers.  
**Hibernate Features**:  
- Unidirectional relationships  
- `@ElementCollection` for storing answers  
- Hibernate Validator (`@NotNull`, `@Size`)  

**Example Code**:
```java
@Entity
public class Question {
    @ElementCollection
    private List<String> options;
}
```

**Problem**: Validations not triggered.  
**Solution**: Annotate the entity with `@Valid` in the service layer.

---

### **6. Social Media App (Posts & Comments)**
**Objective**: Users create posts and comments.  
**Hibernate Features**:  
- Cascading (`CascadeType.PERSIST`)  
- `@CreationTimestamp` for post dates  
- Detached objects and merging  

**Example Code**:
```java
@Entity
public class Post {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comments;
}
```

**Problem**: TransientObjectException when saving detached objects.  
**Solution**: Use `merge()` instead of `save()`.

---

### **7. E-Commerce Shopping Cart**
**Objective**: Users add products to a cart.  
**Hibernate Features**:  
- Composite primary keys (`@EmbeddedId`)  
- `@NamedNativeQuery` for complex reports  
- Batch processing with `hibernate.jdbc.batch_size`  

**Example Code**:
```java
@Embeddable
public class CartItemId implements Serializable {
    private Long userId;
    private Long productId;
}
```

**Problem**: Poor performance with large batch inserts.  
**Solution**: Enable JDBC batching in `hibernate.cfg.xml`.

---

### **8. Hospital Management System**
**Objective**: Manage patients, doctors, and appointments.  
**Hibernate Features**:  
- Inheritance (Staff → Doctor/Nurse)  
- `@Temporal` for dates  
- Stored procedures with `@NamedStoredProcedureQuery`  

**Example Code**:
```java
@Entity
@DiscriminatorColumn(name = "staff_type")
public abstract class Staff { ... }
```

**Problem**: Timezone issues with dates.  
**Solution**: Use `java.time.LocalDate` or set JVM timezone.

---

### **9. Blogging Platform**
**Objective**: Users write blog posts with tags.  
**Hibernate Features**:  
- Full-text search with Hibernate Search  
- `@Lob` for large content  
- `@Formula` for calculated fields (e.g., word count)  

**Example Code**:
```java
@Entity
@Indexed
public class BlogPost {
    @Field
    private String title;
}
```

**Problem**: Slow full-text searches.  
**Solution**: Optimize Lucene indexes with analyzers.

---

### **10. Banking Application**
**Objective**: Manage accounts, transfers, and transactions.  
**Hibernate Features**:  
- ACID transactions with `@Transactional`  
- Pessimistic locking (`LockModeType.PESSIMISTIC_WRITE`)  
- Auditing with `@PreUpdate` and `@PrePersist`  

**Example Code**:
```java
@Entity
public class Account {
    @PrePersist
    public void setCreatedDate() { ... }
}
```

**Problem**: Deadlocks during concurrent transfers.  
**Solution**: Use `LockModeType.PESSIMISTIC_WRITE` or retry logic.

---

### **Common Setup Steps**:
1. Configure `hibernate.cfg.xml` with your database connection.  
2. Use `SessionFactory` to manage sessions.  
3. Handle exceptions like `HibernateException` and `ConstraintViolationException`.  

**Tools**:  
- MySQL/PostgreSQL for DB  
- Maven/Gradle for dependencies  
- Log4j for debugging SQL queries  
