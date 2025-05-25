# Design Patterns in Java

A comprehensive collection of design pattern implementations demonstrating core software engineering principles and best practices. This repository contains practical examples of creational, structural, and behavioral design patterns with problem statements and solutions.

## 📁 Project Structure

```
System_design/
├── Main.java
├── README.md
├── AbstractFactoryPattern/
│   ├── AbstractFactoryDesignPatternProblem.java
│   └── AbstractFactoryPatternSolution.java
├── AdapterPattern/
│   ├── AdapterPatternProblem.java
│   └── AdapterPatternSolution.java
├── BridgePattern/
│   ├── BridgePatternProblem.java
│   └── BridgePatternSolution.java
├── BuilderPattern/
│   ├── BuilderPatternProblem.java
│   └── BuilderPatternSolution.java
├── Factory Pattern/
│   ├── FactoryPatternProblemStatement.java
│   ├── FactoryPatternSolution.java
│   └── PaymentServiceExample.java
├── PrototypePattern/
│   ├── PrototypePatternProblem.java
│   └── prototypePatternSolution.java
└── Singleton Pattern/
    ├── SingletonPatternProblemStatement.java
    ├── SingletonPatternSolution1.java
    ├── SingletonPatternSolution2.java
    ├── SingletonPatternFinalSolution.java
    └── SingletonPatternFinalSolution2.java
```

## 🎯 Design Patterns Covered

### Creational Patterns

#### 1. Singleton Pattern
**Purpose**: Ensures a class has only one instance and provides global access to it.

**Files**:
- [`SingletonPatternProblemStatement.java`](Singleton%20Pattern/SingletonPatternProblemStatement.java) - Demonstrates the problem of multiple instances
- [`SingletonPatternSolution1.java`](Singleton%20Pattern/SingletonPatternSolution1.java) - Eager loading implementation
- [`SingletonPatternSolution2.java`](Singleton%20Pattern/SingletonPatternSolution2.java) - Lazy loading implementation
- [`SingletonPatternFinalSolution.java`](Singleton%20Pattern/SingletonPatternFinalSolution.java) - Thread-safe with double-checked locking
- [`SingletonPatternFinalSolution2.java`](Singleton%20Pattern/SingletonPatternFinalSolution2.java) - Bill Pugh singleton pattern

**Use Case**: `JudgeAnalysis` class for maintaining application-wide run and submit counts.

**Key Concepts**:
- Eager vs Lazy loading
- Thread safety with synchronized blocks
- Double-checked locking pattern
- Bill Pugh singleton pattern using inner static class

#### 2. Factory Pattern
**Purpose**: Creates objects without specifying their exact classes, promoting loose coupling.

**Files**:
- [`FactoryPatternProblemStatement.java`](Factory%20Pattern/FactoryPatternProblemStatement.java) - Shows tight coupling issues
- [`FactoryPatternSolution.java`](Factory%20Pattern/FactoryPatternSolution.java) - Factory pattern implementation
- [`PaymentServiceExample.java`](Factory%20Pattern/PaymentServiceExample.java) - Payment gateway factory example

**Use Cases**:
- `LogisticService` with multiple transport modes (Air, Road, Railways)
- `PaymentService` with different payment methods (UPI, Card, Wallet)

**Benefits**:
- Separates object creation from usage
- Follows Single Responsibility Principle
- Easy to extend with new implementations

#### 3. Abstract Factory Pattern
**Purpose**: Provides an interface for creating families of related objects.

**Files**:
- [`AbstractFactoryDesignPatternProblem.java`](AbstractFactoryPattern/AbstractFactoryDesignPatternProblem.java) - Shows the limitation of simple factory
- [`AbstractFactoryPatternSolution.java`](AbstractFactoryPattern/AbstractFactoryPatternSolution.java) - Region-based factory implementation

**Use Case**: `CheckoutService` supporting different regions (India, USA) with:
- Region-specific payment gateways (Razorpay, Paytm, Cashfree for India; PayPal, Stripe for USA)
- Region-specific invoice types (GST for India, USA Invoice for USA)

**Key Advantage**: Adding new regions doesn't require modifying existing checkout service code.

#### 4. Builder Pattern
**Purpose**: Constructs complex objects step by step, allowing optional parameters.

**Files**:
- [`BuilderPatternProblem.java`](BuilderPattern/BuilderPatternProblem.java) - Shows constructor parameter overload issues
- [`BuilderPatternSolution.java`](BuilderPattern/BuilderPatternSolution.java) - Builder pattern implementation

**Use Case**: `Burger` creation with:
- Mandatory parameters: bun, patty
- Optional parameters: cheese, toppings, coke, sauce, french fries

**Benefits**:
- Fluent interface for object creation
- Handles optional parameters elegantly
- Immutable object creation

#### 5. Prototype Pattern
**Purpose**: Creates new objects by copying existing instances, avoiding expensive object creation.

**Files**:
- [`PrototypePatternProblem.java`](PrototypePattern/PrototypePatternProblem.java) - Shows expensive object creation issues
- [`prototypePatternSolution.java`](PrototypePattern/prototypePatternSolution.java) - Cloning-based solution

**Use Case**: `EmailTemplate` system with:
- Template registry for pre-configured email templates
- Cloning mechanism to avoid recreating templates from scratch

**Benefits**:
- Reduces object creation overhead
- Particularly useful when object creation involves database calls or heavy computations

### Structural Patterns

#### 6. Adapter Pattern
**Purpose**: Allows incompatible interfaces to work together by providing a wrapper.

**Files**:
- [`AdapterPatternProblem.java`](AdapterPattern/AdapterPatternProblem.java) - Shows interface incompatibility
- [`AdapterPatternSolution.java`](AdapterPattern/AdapterPatternSolution.java) - Adapter implementation

**Use Case**: `PaymentGateway` standardization where:
- `RazorPay` and `Paytm` implement standard `PaymentGeteway` interface
- `CashFreePayments` has different method signature (`doPayment` instead of `pay`)
- `CashFreePaymentsAdapter` bridges the gap

**Benefits**:
- Integrates third-party libraries without modifying existing code
- Maintains consistent interfaces across different implementations

#### 7. Bridge Pattern
**Purpose**: Separates abstraction from implementation, allowing both to vary independently.

**Files**:
- [`BridgePatternProblem.java`](BridgePattern/BridgePatternProblem.java) - Shows tight coupling between device and quality
- [`BridgePatternSolution.java`](BridgePattern/BridgePatternSolution.java) - Decoupled implementation

**Use Case**: Video streaming system with:
- **Abstraction**: Devices (Mobile, Computer, TV)
- **Implementation**: Video qualities (HD, 4K, 8K)
- **Bridge**: Quality interface that devices use

**Benefits**:
- Add new devices without changing quality implementations
- Add new qualities without changing device implementations
- Follows Open/Closed Principle

## 🚀 How to Run

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd System_design
   ```

2. **Compile any pattern**:
   ```bash
   javac "Pattern Name/FileName.java"
   ```

3. **Run examples**:
   ```bash
   java -cp "Pattern Name" ClassName
   ```

**Example - Running Singleton Pattern**:
```bash
javac "Singleton Pattern/SingletonPatternFinalSolution.java"
java -cp "Singleton Pattern" SingletonPatternFinalSolution
```

## 📚 Learning Path

### For Beginners:
1. **Singleton Pattern** - Understand instance control
2. **Factory Pattern** - Learn object creation abstraction
3. **Builder Pattern** - Handle complex object construction

### Intermediate:
4. **Adapter Pattern** - Interface compatibility
5. **Prototype Pattern** - Object cloning strategies

### Advanced:
6. **Abstract Factory Pattern** - Family of related objects
7. **Bridge Pattern** - Abstraction-implementation separation

## 🔍 Key Design Principles Demonstrated

### SOLID Principles:
- **Single Responsibility**: Each class has one reason to change
- **Open/Closed**: Open for extension, closed for modification
- **Liskov Substitution**: Derived classes are substitutable for base classes
- **Interface Segregation**: Clients depend only on interfaces they use
- **Dependency Inversion**: Depend on abstractions, not concretions

### Other Principles:
- **Don't Repeat Yourself (DRY)**
- **Composition over Inheritance**
- **Favor object composition over class inheritance**
- **Program to interfaces, not implementations**

## 🛠️ Technologies Used

- **Language**: Java
- **JDK Version**: Compatible with Java 8+
- **IDE**: Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

## 📖 Problem-Solution Approach

Each pattern follows a consistent structure:

1. **Problem Statement**: Demonstrates the issue without the pattern
2. **Solution**: Shows how the pattern solves the problem
3. **Benefits**: Explains why this approach is better
4. **Use Cases**: Real-world scenarios where the pattern applies

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-pattern`)
3. Add your pattern implementation following the existing structure
4. Include both problem and solution files
5. Add comprehensive comments explaining the pattern
6. Submit a pull request

## 📝 Code Style Guidelines

- Use meaningful class and method names
- Include comprehensive comments explaining the pattern
- Provide real-world use case examples
- Follow Java naming conventions
- Include problem statement before solution

## 🔗 Related Resources

- [Gang of Four Design Patterns Book](https://en.wikipedia.org/wiki/Design_Patterns)
- [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [Java Design Patterns Documentation](https://java-design-patterns.com/)

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: All code examples are commented out in the actual files. Uncomment the relevant sections to run specific patterns. This approach allows you to focus on one pattern at a time while keeping all implementations in the same file for reference.