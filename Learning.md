### **Learnings in this Project:**

* @RequiredArgsConstructor is a Lombok annotation that generates constructors for all final and non-null fields.
* @Data: When you add an annotation @Data, it will be the same as adding @Getter/@Setter , @ToString, @EqualsAndHashCode,@RequiredArgsConstructor
* spring-cloud-starter-sleuth  => Just add sleuth in your dependency and you’ll see trace ids are propagating in all logs.
* @NoArgsConstructor : It is **compulsory** in Entity class.
* It is not **compulsory** to add _@**Repository**_ Tag on your Repository interface. Because it is already being extended by JpaRepository in its hierarchy.