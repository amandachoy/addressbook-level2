package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Block, Street, Unit, Postal Code";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    private Block block;
    private Street street;
    private Unit unit;
    private Postal_code postalCode;

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String[] value= address.split(", ");
        this.block = new Block(value[0]);
        this.street = new Street(value[1]);
        this.unit = new Unit(value[2]);
        this.postalCode = new Postal_code(value[3]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public Block getBlock() {
        return this.block;
    }
    
    public Block getStreet() {
        return this.street;
    }
    
    public Block getUnit() {
        return this.unit;
    }
    
    public Block getPostalCode() {
        return this.postalCode;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return Objects.hash(block, street, unit, postalCode);
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
