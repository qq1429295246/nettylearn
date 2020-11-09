package com.meanlo.nettylearn;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import org.junit.jupiter.api.Test;

public class AllocatorTest {
    @Test
    public void allocator(){
        PooledByteBufAllocator pooledByteBufAllocator = new PooledByteBufAllocator();
        ByteBuf buffer = pooledByteBufAllocator.buffer(112);

    }
}
