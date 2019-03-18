package L6Tasks.L6Task6;

/**
 * Interface that realizes parts of house
 */
public interface IPart
{
    /**
     * Get name of part of house
     * @return - String - name of part
     */
    abstract String getName();

    /**
     * Get width of part of house
     * @return - int - width of part
     */
    abstract int getWidth();

    /**
     * Set width of part of house
     * @param width - int - width of part
     */
    abstract void setWidth(int width);
    /**
     * Get height of part of house
     * @return - int - height of part
     */
    abstract int getHeight();
    /**
     * Set height of part of house
     * @param height - int - height of part
     */
    abstract void setHeight(int height);
    /**
     * Get length of part of house
     * @return - int - length of part
     */
    abstract int getLength();
    /**
     * Set length of part of house
     * @param length - int - length of part
     */
    abstract void setLength(int length);


}
