# Strategy Pattern

Strategy pattern defines different algorithms and make them interchangable. It allows us to change the behavior of an 
algorithm at runtime. 

In the example that I have taken `Discounter` is an interface with following method.
```
public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);
}
```

There are two strategies namely `ThanksGivingDiscounter` and `ChristmasDiscounter` and they implement `applyDiscount` with 
different algorithm

## Using lambda

Two strategies and implementation can be rewritten in lambda. It is a lot cleaner.

Following is the inline lambda expression for `ThanksGivingDiscounter`

```
 Discounter thanksGivingDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));
```

With this implementation, as we have functional interface with single method, lambda expression also reduces verbosity.
