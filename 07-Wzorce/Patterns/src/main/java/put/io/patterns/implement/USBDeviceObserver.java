package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver{
    private int lastDeviceNum = 0;

    @Override
    public void update(SystemMonitor monitor) {
        SystemState lastSystemState = monitor.getLastSystemState();
        int newDeviceNum = lastSystemState.getUsbDevices();

        if(newDeviceNum != lastDeviceNum){
            lastDeviceNum = newDeviceNum;
            System.out.println("Number of devices has changed !");
        }

    }
}
