
package com.example.myapp;

/**
 * Defines several constants used between {@link BluetoothChatService} and the UI.
 */
public interface Constants {

    // Message types sent from the BluetoothChatService Handler
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_READ = 2;
    public static final int MESSAGE_WRITE = 3;
    public static final int MESSAGE_DEVICE_NAME = 4;
    public static final int MESSAGE_TOAST = 5;

    // Key names received from the BluetoothChatService Handler
    public static final String DEVICE_NAME = "device_name";
    public static final String TOAST = "toast";

    //Instruments Key
    public static final String INSTRUMENT = "SelectedInstrument";

    public static final int INST_FLUTE_VALUE  = 1;
    public static final int INST_GUITER_VALUE = 2;
    public static final int INST_PIANO_VALUE  = 3;

}
