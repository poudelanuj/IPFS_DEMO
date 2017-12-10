package ipfs_demo;


import io.ipfs.api.IPFS;
import io.ipfs.api.IPFS.File;
import io.ipfs.api.MerkleNode;
import io.ipfs.api.NamedStreamable;
import io.ipfs.multihash.Multihash;

import java.io.IOException;
import java.util.Base64;


public class IPFS_Demo {

    
    public static void main(String[] args) throws IOException {
        IPFS ipfs=new IPFS("/ip4/127.0.0.1/tcp/5001");
        NamedStreamable.ByteArrayWrapper file = new NamedStreamable.ByteArrayWrapper("hello.txt", "new IPFS".getBytes());
        MerkleNode addResult = ipfs.add(file).get(0);
        Multihash pointer = addResult.hash;
        System.out.println(pointer.toString());
        
    }
    
}
