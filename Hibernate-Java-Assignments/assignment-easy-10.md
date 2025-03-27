

### **1. Student Record Manager (CRUD)**
**Objective**: Create, Read, Update, Delete student records.  
**Hibernate Features**:  
- Basic `@Entity`, `@Id`, `@GeneratedValue`  
- `Session.save()`, `Session.get()`, `Session.delete()`  

**Example Code**:
```java
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    // Getters & Setters
}
```

**Problem**: `Unknown Entity` exception.  
**Solution**: Add `Student` to Hibernate config (`<mapping class="Student"/>`).

---

### **2. Todo List Application**
**Objective**: Add/delete tasks with due dates.  
**Hibernate Features**:  
- `@Temporal(TemporalType.DATE)` for dates  
- `Session.createQuery("FROM Todo")`  

**Example Code**:
```java
@Entity
public class Todo {
    @Id @GeneratedValue
    private int id;
    private String task;
    
    @Temporal(TemporalType.DATE)
    private Date dueDate;
}
```

**Problem**: Incorrect date format saved to the database.  
**Solution**: Use `SimpleDateFormat` to parse user input.

---

### **3. Library Book Tracker**
**Objective**: Track books and their authors (One-to-Many).  
**Hibernate Features**:  
- `@OneToMany` (Author → Books)  
- `CascadeType.ALL` for auto-saving child entities.  

**Example Code**:
```java
@Entity
public class Author {
    @Id @GeneratedValue
    private int id;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();
}
```

**Problem**: Books not saved when saving an author.  
**Solution**: Ensure `cascade = CascadeType.ALL` is added to `@OneToMany`.

---

### **4. Simple Blog System**
**Objective**: Users write posts (One-to-Many: User → Posts).  
**Hibernate Features**:  
- Bidirectional mapping (`@ManyToOne`)  
- `@JoinColumn` to define foreign keys.  

**Example Code**:
```java
@Entity
public class Post {
    @Id @GeneratedValue
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
```

**Problem**: Foreign key column `user_id` not created.  
**Solution**: Add `@JoinColumn` to specify the foreign key name.

---

### **5. Product Catalog**
**Objective**: Store products and categories (Many-to-One).  
**Hibernate Features**:  
- `@ManyToOne` (Product → Category)  
- HQL to fetch products by category.  

**Example Code**:
```java
@Entity
public class Product {
    @Id @GeneratedValue
    private int id;
    
    @ManyToOne
    private Category category;
}
```

**Problem**: Duplicate categories created.  
**Solution**: Check if a category exists before saving a product.

---

### **6. Movie Database**
**Objective**: Movies and genres (Many-to-Many).  
**Hibernate Features**:  
- `@ManyToMany` (Movie ↔ Genre)  
- `FetchType.EAGER` to load relationships immediately.  

**Example Code**:
```java
@Entity
public class Movie {
    @Id @GeneratedValue
    private int id;
    
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Genre> genres;
}
```

**Problem**: `LazyInitializationException`.  
**Solution**: Use `FetchType.EAGER` or fetch data in the same session.

---

### **7. Employee Manager**
**Objective**: Employees and departments (Many-to-One).  
**Hibernate Features**:  
- `@ManyToOne` with `mappedBy` (bidirectional)  
- `orphanRemoval = true` to delete unused departments.  

**Example Code**:
```java
@Entity
public class Department {
    @OneToMany(mappedBy = "department", orphanRemoval = true)
    private List<Employee> employees;
}
```

**Problem**: Deleting a department doesn’t delete employees.  
**Solution**: Use `orphanRemoval = true` or `CascadeType.REMOVE`.

---

### **8. Online Quiz (Single Table)**
**Objective**: Store quiz questions and answers.  
**Hibernate Features**:  
- `@ElementCollection` for storing answers  
- `@CollectionTable` to map lists.  

**Example Code**:
```java
@Entity
public class Question {
    @Id @GeneratedValue
    private int id;
    
    @ElementCollection
    @CollectionTable(name = "answers")
    private List<String> options;
}
```

**Problem**: `options` not saved as a separate table.  
**Solution**: Add `@ElementCollection` and `@CollectionTable`.

---

### **9. Contact Book**
**Objective**: Store contacts with phone numbers.  
**Hibernate Features**:  
- `@Embedded` for reusable address/phone fields  
- `@AttributeOverrides` to customize embedded fields.  

**Example Code**:
```java
@Embeddable
public class PhoneNumber {
    private String home;
    private String mobile;
}

@Entity
public class Contact {
    @Id @GeneratedValue
    private int id;
    
    @Embedded
    private PhoneNumber phone;
}
```

**Problem**: Embedded field column name conflicts.  
**Solution**: Use `@AttributeOverride` to rename columns.

---

### **10. Basic Banking System**
**Objective**: Track accounts and balances.  
**Hibernate Features**:  
- `@Transactional` for transfers (debit/credit)  
- `@PreUpdate` to log balance changes.  

**Example Code**:
```java
@Entity
public class Account {
    @Id @GeneratedValue
    private int id;
    private double balance;
    
    @PreUpdate
    public void logBalanceChange() {
        System.out.println("Balance updated: " + balance);
    }
}
```

**Problem**: Negative balance after withdrawal.  
**Solution**: Add validation in the `setBalance()` method.

---

### **Setup Tips for All Projects**:
1. **Configuration**: Use `hibernate.cfg.xml` to set your database (e.g., H2/MySQL).  
2. **Dependencies**: Include Hibernate and your JDBC driver in `pom.xml` (Maven).  
3. **Session Handling**: Always close sessions with `session.close()` to avoid leaks.  

**Tools**:  
- **Database**: H2 (embedded, no setup) or MySQL.  
- **IDE**: IntelliJ/Eclipse with Hibernate plugins.  
