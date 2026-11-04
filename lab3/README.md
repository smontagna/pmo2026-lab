# Inheritance

### Improving an existing design with inheritance

We will work inside the package `bank`.
In last week's exercises, we had lots of duplicated code between `SimpleBankAccount` and `StrictBankAccount`.

* Create a new class `ExtendedStrictBankAccount` that extends `SimpleBankAccount`, with the same behavior of `StrictBankAccount` (provided by us). Your goal is to reduce, as much as possible, code duplications. *Note:* modifying `SimpleBankAccount` is forbidden. There must be **NO** change.

* Answer the following question:

> We used inheritance in order to improve a sub-optimal design (of course it was sub-optimal, we didn't know inheritance existed!). How would have designed the application, if you knew interfaces and inheritance? Provide a simple UML scheme (draw it on paper) with your design proposal and let the teacher see it.

### Guided design from scratch in a simple scenario

We will work inside the package `bank2.inheritance`.
Create from scratch an `abstract class AbstractBankAccount implements BankAccount`:

* It must contain all the elements common to all the implementations of `BankAccount`
* All fields **must** be `private`
* The class must expose as `public` all the `BankAccount`'s methods, and only those
* The class must define a `protected abstract` method `boolean isWithDrawAllowed(double)`, which returns `true` if it's possible to draw from the bank account the amount passed as parameter.
* The class must define a `protected abstract` method `double computeFee()`, which returns the current amount of the management fees (does not modify the state of `AbstractBankAccount`.

Create from scratch a class `ClassicBankAccount extends AbstractBankAccount`, with the same behavior of `SimpleBankAccount`.

Create from scratch a class `RestrictedBankAccount extends AbstractBankAccount`, with the same behavior of `StrictBankAccount`.

Answer the following question:

> Is this design in you opinion better or worse than the previous one? Why?

