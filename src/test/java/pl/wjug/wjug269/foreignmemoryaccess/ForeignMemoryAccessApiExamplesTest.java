package pl.wjug.wjug269.foreignmemoryaccess;
//
//import jdk.incubator.foreign.MemoryAddress;
//import jdk.incubator.foreign.MemoryHandles;
//import jdk.incubator.foreign.MemorySegment;
//import org.junit.jupiter.api.Test;
//
//import java.lang.invoke.VarHandle;
//import java.nio.ByteOrder;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class ForeignMemoryAccessApiExamplesTest {
//
//    @Test
//    void simpleMemoryAccess() {
//        //given
//        MemoryAddress address = MemorySegment.allocateNative(4).baseAddress();
//        VarHandle handle = MemoryHandles.varHandle(int.class, ByteOrder.nativeOrder());
//        handle.set(address, 10);
//        //when
//        int value = (int)handle.get(address);
//        //then
//        assertThat(value).isEqualTo(10);
//    }
//
//}
