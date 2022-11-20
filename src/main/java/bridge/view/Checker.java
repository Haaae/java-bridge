package bridge.view;

public class Checker {
    private static final Checker checker = new Checker();
    private final int MAXIMUM_BRIDGE_SIZE = 20;
    private final int MINIMUM_BRIDGE_SIZE = 3;
    private final String MIVING_UP = "U";
    private final String MOVING_DOWN = "D";
    private final String GAME_RESTART = "R";
    private final String GAME_QUIT = "Q";

    private Checker() {}

    static Checker getInstance() {
        return checker;
    }

    void validateBridgeSize(String bridgeSize) {
        try {
            if (checkBridgeSizeRange(Integer.parseInt(bridgeSize))) {
                throw new IllegalArgumentException(InputExceptionMessage.WRONG_BRIDGE_SIZE.getMessage());
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(InputExceptionMessage.WRONG_BRIDGE_SIZE.getMessage());
        }
    }

    private boolean checkBridgeSizeRange(int bridgeSize) {
        return MINIMUM_BRIDGE_SIZE <= bridgeSize && bridgeSize <= MAXIMUM_BRIDGE_SIZE;
    }



}
