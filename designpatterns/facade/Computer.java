package facade;

import facade.child.CPU;
import facade.child.Disk;
import facade.child.Memory;

public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start(){
        System.out.println("电脑开始工作");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("开始工作的步骤完毕");
    }

    public void shutdown(){
        System.out.println("电脑结束工作");
        cpu.shutDown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("电脑结束工作结束");
    }
}
