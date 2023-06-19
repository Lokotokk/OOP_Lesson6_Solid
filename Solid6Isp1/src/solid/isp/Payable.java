package solid.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface Payable extends PayableWebMoney, PayableCreditCard, PayablePhoneNumber {
}
