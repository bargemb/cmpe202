# Din Tai Fung Design Pattern

This problem can be solved using **Observer** pattern. Following is the approach -
- Table object knows about it's capacity. It acts as **Subject** and notifies to Restaurant (acting as subscriber in this case) whenever it's state changes i.e. becomes free.
- **Restaurant** will take action based upon notification from table. Whenever update happenes Restaurant (now acting as **Subject**) depending upon waitlist will notify **Customer** through message.

### CRC Card
