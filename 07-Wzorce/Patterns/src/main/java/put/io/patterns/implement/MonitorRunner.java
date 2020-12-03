package put.io.patterns.implement;

public class MonitorRunner {

    public static void main(String args[]){
        SystemMonitor monitor = new SystemMonitor();

        SystemStateObserver infObserver = new SystemInfoObserver();
        monitor.addSystemStateObserver(infObserver);

        SystemStateObserver coolerObserver = new SystemCoolerObserver();
        monitor.addSystemStateObserver(coolerObserver);

        SystemStateObserver garbageObserver = new SystemGarbageCollectorObserver();
        monitor.addSystemStateObserver(garbageObserver);

        SystemStateObserver usbObserver = new USBDeviceObserver();
        monitor.addSystemStateObserver(usbObserver);

        while (true) {

            monitor.probe();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
