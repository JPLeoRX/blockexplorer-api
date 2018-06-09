package com.tekleo.blockexplorer_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Address Test
 * 
 * @author Leo Ertuna
 * @since 09.06.2018 13:40
 */
public class AddressTest {
    private static final double DELTA = 0.0000001;

    @Test
    public void test() {
        String json = "{\n" +
                "    \"addrStr\": \"19SokJG7fgk8iTjemJ2obfMj14FM16nqzj\",\n" +
                "    \"balance\": 0,\n" +
                "    \"balanceSat\": 0,\n" +
                "    \"totalReceived\": 112.91089695,\n" +
                "    \"totalReceivedSat\": 11291089695,\n" +
                "    \"totalSent\": 112.91089695,\n" +
                "    \"totalSentSat\": 11291089695,\n" +
                "    \"unconfirmedBalance\": 0,\n" +
                "    \"unconfirmedBalanceSat\": 0,\n" +
                "    \"unconfirmedTxApperances\": 0,\n" +
                "    \"txApperances\": 364,\n" +
                "    \"transactions\": [\n" +
                "        \"a2afb522edeba67ae593c683154da45b231d59ffccd18806cec38ecd21994a2d\",\n" +
                "        \"28ccc7fe617451a4d15b8cea64a6ac222600e2877073ba543d83225a354975ac\",\n" +
                "        \"950239654cd47d2b53f98bdf250cfbf516e1a9eaf87944ee8afac603a9cb61fc\",\n" +
                "        \"4daa82997cb86b6f75089ad19eddf518b77a4d88a72920efbab6439914a2183b\",\n" +
                "        \"27b6dc933a9eee548d5b40574c16e9e29a907e9a85a51c2545a60a0833a0f441\",\n" +
                "        \"cacc6ded99959ff8310b18e1052e05a4aa9fe8c4c7f9651318fbbe3fcd5a16ab\",\n" +
                "        \"de46a46ba0176d236ad97e6e60fd610dcfccc1b7bef74c472afdef1db231ce85\",\n" +
                "        \"c7f294d0b85c4b13b08fa4704060635bd858c8ba74ac39ddb0d588ad374d2e8c\",\n" +
                "        \"5e0bd3c8df4a4408a3edd76661844a4eeaf46a444247c18a74b8676668526410\",\n" +
                "        \"357f6267173aa7eaa5fe4339a330048497b8bd5f91881ba30cdb2d9cb8033365\",\n" +
                "        \"7ff688db552b277849f8a1c6e2a671e746a4b884786d99cf9934e3f7f830e369\",\n" +
                "        \"ba50f2b421440b86e2f82419381427677f1632a90d4288d05b1874758efe6f05\",\n" +
                "        \"350b7a0234cf57b00e1358686e280c971b865917deb3fc09a1fc2b31b538b92f\",\n" +
                "        \"666fc3001c3a9b350e2afa25a64dffb80930636f60562a3e1e1525d1ac47215f\",\n" +
                "        \"187c140a4fda8d4532180abb96fcdd5c4da922d3abde2106c9721cffe3cc4c16\",\n" +
                "        \"735e0b7ab631a8b6dc39c424d815e6800da8faaa4e5c30d4e7142e5a7ae733c3\",\n" +
                "        \"0e646cb210277f7f123e67e1a72c14a8b1ebde97aef15be698ac12144fa556c1\",\n" +
                "        \"b1a7fe3635df22652f819bee4e5c7e10fd9b4766813ccd0df2cbc6c44a20548f\",\n" +
                "        \"6c7fc20337412bbc1af641e084158c7d867f8828d405ae77de5af78416caab6d\",\n" +
                "        \"d4d03d9a712a34d032a7f543e4907d56ed3151bbe37dfaec01db5a1a4e5242f8\",\n" +
                "        \"d13e992abeb94c9657a8469100242412124d16f5d8998818f43d600561937471\",\n" +
                "        \"744b02290f3300e3b1862731f8bfcacc07bc3c3d26bebba04c485f35b75ed0ac\",\n" +
                "        \"903cdd98e719c6586b4d6636832d16e8c1dc91edb22eb17243fee77304683207\",\n" +
                "        \"89398a50c3cddeb8e6adcb619a81399f2ad0273619e468ec05c9f040b6f557bd\",\n" +
                "        \"7fe8a6a1cba3f5b37cb1772f1113ecfd19427f3d48eb269b021515965a0d015d\",\n" +
                "        \"ace748a63792144334db51beae39ce1c189a9fe8e33b2ad79f7a2c6c38c7f1f7\",\n" +
                "        \"6e83c31118d2ccdf7aa29101343cd29b816b389e2132ea2f1cbebad97a9326d9\",\n" +
                "        \"ba2078fdc828b1fac3e791ec75a7cc7db33aa7c3888ac2c933451751672c71ad\",\n" +
                "        \"1ba74e5e82668d635979e90454d764ae5826adf74dbdb1d7cc777c47160b791f\",\n" +
                "        \"37a212ca998668b94a290b4ff835e0ffd51da0d541f31d23120f97e0643788c1\",\n" +
                "        \"250813f12a1b7b717b7347a94a379fb9cff361960ec4f1451a89c4e2c40800d3\",\n" +
                "        \"d61f45533a3baed6dcd52ff70cfc3fc0ce78acf10b6395bf64d314f88cd76f33\",\n" +
                "        \"9a16929ad98edddab53112e933c679b388aabbdf8af82ec32665df423873d41b\",\n" +
                "        \"e9d11606cee9f10f2d7e088f27d669f70e0e936b88454aa936cd33dc26f8ef4c\",\n" +
                "        \"8836decbf61adc31d01c67d9ae987a3cca43da723ba441c4a7ab638ee0384357\",\n" +
                "        \"f64b305aed594ec902a4e9b4eb56445ea59ebdd71be60e9a870433fa2623be23\",\n" +
                "        \"67f568abc6514376e44b6e0dc7c6f64995aad5def63663ae13bb06f875955db9\",\n" +
                "        \"d200071325b584ddec51b907e97a3286ab596defd8e4cd31ab110f298f82e9d0\",\n" +
                "        \"251c653456711f50ebbb741e0e36e11da7516daef68031d882e25a5976265320\",\n" +
                "        \"5532e2f4a28c64cdbfc1ede817dfa5d5546095933ffe6cc53efa6d772156e96b\",\n" +
                "        \"f1de25f1803e78ff0322f6c125295dc22e569c8a5afe3981c6df51079a1c7e45\",\n" +
                "        \"f9131455fd0559e8cd19389892208c44096e8ffc8c6205d68dc587578459653e\",\n" +
                "        \"87c820ef4a2f42465b69eb9c14f3775ba6d652fc7d5c8d7c0a89f7483cefa11c\",\n" +
                "        \"86567bc277b51ceccbf3e171614c010043e5ecb6446d48099ffebca96062bc46\",\n" +
                "        \"d1dbc30a5aa08ef3156dc23e96deb6ef6bac1931c7a6c30c5e9fb7f51c5dcca2\",\n" +
                "        \"96cee0d11d7e3f8699db0eab10f751e598918282b7767e5475eeb4395317236b\",\n" +
                "        \"68958692265dc0d89d10017b5b0b622ae96802ddaa7ec494763e1f5f748c2bb0\",\n" +
                "        \"ce20dc20d4cd5564a6655c80414906507a2ee9ceaa841f16ec68e26275b089e3\",\n" +
                "        \"c839ac8e280dc9105ef2d9cfba0cbe43de7f392934b468e9484a8ebb60409f17\",\n" +
                "        \"30bf7a7bddecdbc4281a7a92f21716abe817ab663a2639a953d741461b617587\",\n" +
                "        \"bd5002ff7200ad3cbdd72912af09687dc1624a89c8734b52682692ac5149784f\",\n" +
                "        \"720a48c8d2e6e5991f3dd19b2bc83d3d363af325ecdecc2b44b5f2d1c7b40495\",\n" +
                "        \"13656dcb3051836da94695062ca36bf3864653e70c1e5d7c41c985bc812129bb\",\n" +
                "        \"aa7723fe6a6d94cbae726ddc0096345e05ebe899f6c81d3dc2f87c432e8b5408\",\n" +
                "        \"7b10db92fe306f689ef7b8e1255630a54b7dff29a77cdd8a481e0b396971e4b6\",\n" +
                "        \"d0d95c41d6db5aac8a0d4334ebcb39d578536b64dc565835770fd735e2e9516b\",\n" +
                "        \"02db285e09efbc42568418b734f654fd2642c554eb6624e51ba98791868c72ae\",\n" +
                "        \"38f022421b3251cad83355ff90638a14e96a7a5e70fdb6a880dcca50b857c816\",\n" +
                "        \"0fad58007d89e9ed9a7387f64046aba59034292502d589492d10b81ca34e6ba4\",\n" +
                "        \"5b474c38aaa7508e65b2abaa1d66deac78145ba9869854f61b982f2826a360ae\",\n" +
                "        \"5c65bfb63fa8e9e98f45491550ec8725280254f5c0bdc55d5046d57a5e1824d7\",\n" +
                "        \"556ef6fd331f28aad8baa47f96e3558c3d185f56408e72709549b8d34a30c378\",\n" +
                "        \"6ed1cc7e39658e916cb8f12ffa5da49feb5118a2a042ba3acc7b7b8de723d199\",\n" +
                "        \"442c8d6da9dda678f8fa25c76aa78cc8df8b51d5cf2f70d5cb8fbb02f51cce22\",\n" +
                "        \"d07c1f3cb3b8d92e1819cf471e0569ed38bef840321dd791ac343fb26cdc0d61\",\n" +
                "        \"e213d874ee47e469b9fbe274243d599c8af20aaefedf4834322a76037944ab54\",\n" +
                "        \"dbbe823e6720e1f96ac8188b6d62c48788bdf86536259ace99773e6a0fccea29\",\n" +
                "        \"fa0f1b91c90fd533b245aa6b6bf70d90faf78925408b1d2f69e8eedde53adf8b\",\n" +
                "        \"1e22beaf25ae18fcbe1ef4e511472d79ab2ce9fc11465a79b0397d57cc4ddab9\",\n" +
                "        \"d77c51a4ccd9ccf5c50272e79f4f6f5ba22aa15b2bdadeeb590bd4b77358250c\",\n" +
                "        \"cf75396ae8542649411d2a471229e7b1ed9e2cbc1331e23a16fc720f67069732\",\n" +
                "        \"e8a31d3d0d084c61ef526fa45d6b562e024a46043fa4698f044bc66328102e8d\",\n" +
                "        \"519778e78ed24357d61e3fbb91b2eb846a21f80a43d0c866b9a3237a6cb38e75\",\n" +
                "        \"3805d3144038da728b55b6d6d27a0ed3e2028faeb2ba16b111d2ef192abc2ad8\",\n" +
                "        \"25bde931546bf6b4ba4e3c67f6499f3afb37151eebd1260f503f791265af007d\",\n" +
                "        \"4e33c749d3e2c26a144b890f429b0fc323dd2b43fa110b2a073d759ee2bdf50b\",\n" +
                "        \"d165eaa8051a5b4b4f2f35072065a8f1cb5a8f30c8ea223a0aafc235f3530e70\",\n" +
                "        \"91ad5ac061d8d6e9998de207accb1a532d14ffe0b1da3b95353cac891f80434d\",\n" +
                "        \"dd4f7198ceef035e2f2af0a5f674c120615e87a2806ec79e8c6925af4cc051ae\",\n" +
                "        \"49e41976effc173b4602bc3955dd6aaf0cc2f3c832399ea6cc31ecbeecd4aee0\",\n" +
                "        \"ec0d9eab27cb6b25ac774467a3fb5ceabfc793d5dcc514988e40d9a0f73baca0\",\n" +
                "        \"6b6d4b738ae6dbbeeaa0d57c87891e41695c921a10a7f19e81668b4c568ff0c5\",\n" +
                "        \"5b2228bfbc633682ca2cb335a4adb8451171960c5f2ff1b09e783468c79969d7\",\n" +
                "        \"c1e2b839bba4338010c6f8bbdb93e9005f5c2c6da53a56d831615cdca05192df\",\n" +
                "        \"6abf437e68c5700171e81d640c8d460f805b2392c3837b2dbbe80d4400f2f0c7\",\n" +
                "        \"c9a14983e3c765b601d9de4c5c7b7bf59071049d1e117d7dcd3bbbef96bfdc2a\",\n" +
                "        \"6bbbff65e66542f8856a70561471415504e8ea1ab212170970562337f13bcf82\",\n" +
                "        \"1c9b45e3659c1d95f79c004224537287847cba1a6443a62ee20862628633c5e5\",\n" +
                "        \"fb0e569406ccf46b84000301dbfbd43dd2601f83be01feee27e82388b08315a5\",\n" +
                "        \"826a4247311332485a9a05e6ff8a65b41d4e72ef2ccc7d20e3ebc89f014c27ac\",\n" +
                "        \"d2a01a9e4b14e18bd85998f656bb87139dc0b73a5421a6fbc6782906da0e8ae9\",\n" +
                "        \"672e3e9fe2739f7feaf5547e3291184d344178f1c199fbd9b07d3a5458ae4aec\",\n" +
                "        \"1e39a4a0715b66c45e15ffe783124b4dfe302d2e1cd763fff423586d5c73a8f6\",\n" +
                "        \"28f5224cdbd750900fb45494937a1bed5fe25b08586fd136b5d90deb30f1de3d\",\n" +
                "        \"dc3ebc9c3a58b0f7c2aff6a33049f1e8d9e4ea95baed832c65f140204e01d806\",\n" +
                "        \"89c79baf905c99f16f7092baa6a2d70a2e6c855009ebfb39d890196387db2809\",\n" +
                "        \"32bb8760d2d460ce305b9c5d92b7016004092cc6bac072d7ae2988cc5dcb2a39\",\n" +
                "        \"2adc85943a7499e37174629c7da75d70de8ba766bf022dab45638a0d268647e2\",\n" +
                "        \"8e5cba86c1bddb17fb451b66b81e6b962bedc75fb09f145070453fbe5ae665ea\",\n" +
                "        \"df7db7ddc261f158f256d24e3cdfe6745041cb79a1aaf54432959cbb1184bb7b\",\n" +
                "        \"73ad6e897c08cac8c216ad4be846ad6ba77cc2620d2f31bf9f35d1887018ecf4\",\n" +
                "        \"95c578e0df8abf737ff900de28d7cee2d62639594109e3eb1a2a1c402178a28f\",\n" +
                "        \"16e95e85d682bbe98e51e0a7fc2eeb35a076a2b5c880724087353ddcbc61c6ee\",\n" +
                "        \"d9360389f5ca3731cbbc50bf6c19ba226c686694cf53b0918961453699c0a430\",\n" +
                "        \"3ccc85e7b7182c7ea3fc0de52d62c677b2b3f5b973102dbad547b303704f820b\",\n" +
                "        \"2a56a49240615b238ab9fbdd01924d262c5d1488571daa74fdaff94efc26c4d4\",\n" +
                "        \"f814bebcc1bf3112ff6b54180842e81bbf0a78a3483841a173600d84eb285f2e\",\n" +
                "        \"c1b579ea24a1e392cc28b05db24b7ce84d31ec5e165fa9dcca2bcaf2964171aa\",\n" +
                "        \"59f5696342969a839f225c8854ecc27b78481ab3beee6611592d60c26ffd9418\",\n" +
                "        \"1c6316b99e0073e21f71529944ee35a340568da777cdf886b3edc76126988c7b\",\n" +
                "        \"cfdb129273a98d7fb617ff9a6e7aec82a81d64ebb04848698ac580407ed7d756\",\n" +
                "        \"cb3ef8abcf3ccfdafbd99369270c0000b9bd1622a3676fcf758dddd59e603bff\",\n" +
                "        \"7f0d47e79daf42e0702b22a59a052d08bf5f6d01ad1ca547e9ff62d1c5b45bad\",\n" +
                "        \"76b7dd4044c92e12dbf36dcd62c8fbb64a63d3a40322caefe12adadbf09b07cd\",\n" +
                "        \"02719ae1cbc9f114d7839c49d6fd379079359691549d6806fa35cee90b6e69c8\",\n" +
                "        \"32f1332c021ae3d92eb3449ca39b8e359af608fb668023dedcb6b4364a685096\",\n" +
                "        \"e53de05355ddbe6c911bb7f2ef907e72d12d7468ae82266729535330cd8e134c\",\n" +
                "        \"e6b97c1e450d47ebcfd7337fe3d78c0489b420a2e4722406d3561629ad5a0158\",\n" +
                "        \"119864867e3f4e216d09f19387676d50be7f80a91bdb7df54d0526557710c549\",\n" +
                "        \"93cb6ebdd88babc4685602c7e58a81a54da211cbe59363b340fba282513581c2\",\n" +
                "        \"1cea1e7d61b6cf100749296c09ab5a59c559237c98aa8e2449bc0271ab3e0397\",\n" +
                "        \"a720c04d28806a447ac01a04ef061b0b991ff0635eff8e037933b18921b549e7\",\n" +
                "        \"41fe3a9e27fea47043bc5056461713eaec9fa00e64be86b961d0e7fd1107b8a4\",\n" +
                "        \"11329e23b4c4d2cd88b4e2656e95e8411ff7a0350e7f401b1829ae394846c5ac\",\n" +
                "        \"2758452650518496338e019783bc5fdce936daeaf9429c406dd8637315cf60b5\",\n" +
                "        \"53a01c74ec1d623f7cc47f9f2828ddcf4ed5ce3f80bfa41889a95bfe810ceff3\",\n" +
                "        \"88d159f3b67275f32b3ff950a98158f723048adb7106a505dea63928e65e584a\",\n" +
                "        \"29e6c77e0390dd35d24b037dada3ca0cc37a83a32457b6d1a8f150944602658b\",\n" +
                "        \"119411509f70c84230bb216e9a1da1cc62e471f8697d8a8c4838578c23491edc\",\n" +
                "        \"1c177db084185ea947d1e9ff28953a126cd7d5589ef59d13d9748836bffa0653\",\n" +
                "        \"b050ebaea095b06cf2324480327c29e9443aa390bad69748e8aafa6ffaa6f598\",\n" +
                "        \"24e5f8082ea8a7391977f9155dd9df24d3e3389fc31f09363fd5d7f089c8c2d8\",\n" +
                "        \"741b873248247def38c6c3622410c449a5cd7e5ebcca1bcfbcc66f78df38761c\",\n" +
                "        \"d1e5183544bcd90301d81ec0e1063c7a5c3096b5458f963f9334dc42ac767c1a\",\n" +
                "        \"50701c462f492ebef7d03aa9cc4baa74c153f8aec119f1710b3f0f6bcef222ed\",\n" +
                "        \"fd2152d0828bc7298814090577aae2c38c6b872f8fd52c0b0e4f1aa369c891c7\",\n" +
                "        \"94b2ce0dcc86e5021f539b72cd225bca0eac3f2308d3e1febf7af6f2e4dd9910\",\n" +
                "        \"9d6e77ca61bb08e4f69e702ecacbb31ecf03189e33dd1c0075ec49ebfdc7e16b\",\n" +
                "        \"310cca8aa42bf3cc1a8d00993244d4976bc1ae6ad40404e65a0c45c00a35602b\",\n" +
                "        \"b30498b6be1ce8c290b81bbfe9ce2e74f77128e37257dcb4e08fbb73154304b7\",\n" +
                "        \"156d93aed1d8135754876bf3347836a64e00c050f2ef6fe0105e6a28eb62dd50\",\n" +
                "        \"cbf4df44d27107b01060ad9b5a1dc0f3d52db992e7d5c007e578d21badf78610\",\n" +
                "        \"8969e8528fa6cd0b362bef515257d1bf1b8a134bc1ec8b50cf727978507e1c8c\",\n" +
                "        \"5033bc1edadc94bcea5f3ff035478cd43db39dd5d5a40d564187c76922009dfd\",\n" +
                "        \"a2a09cca7e8497a82b4cad34f6cfbbae827ffd79744241292d798b1ef9b9a886\",\n" +
                "        \"f1fef0775f1332a5792aa3adab8d2285b7a06d85ff7c2dd55dc44b164ac9cbe7\",\n" +
                "        \"709f9c320534b22d19a091c4307ad7b6e17f16d247affa574a0f440cc16173b6\",\n" +
                "        \"5fce18734acc84beca7c76160a408d2b46dd931b5b328f494a9b989085f4f878\",\n" +
                "        \"6feae9cdfec38cbfd2c159f2f276e87caaad505ebaf37af06479e41cbe49b217\",\n" +
                "        \"7784002b22ee37f35ac255d384fd0d31197eb1cd1fc6fda3c090f608cd95d458\",\n" +
                "        \"b2ceeb44eb67e6c0192b0d1ea665b739f4723850f6c12559022880faafdd47f6\",\n" +
                "        \"e10f99494e5af2135c262cbdc8551b54c8f9c573603df9db9161513167885468\",\n" +
                "        \"99fe5212e4e52e2d7b35ec0098ae37881a7adaf889a7d46683d3fbb473234c28\",\n" +
                "        \"a756b6a7bf3a6773c20fbe3b50aa408222da1d003fe3a4333ae7f4a2b1b5d843\",\n" +
                "        \"690c04c8ab9bea6611ae64e33c7256405cc53a9dea061ed2153368a1f9bc8dd4\",\n" +
                "        \"198dd6e849934d28c18cecb616335609acbebb2ff219a40792391d4be503ebd6\",\n" +
                "        \"7f31e8d66b3ef84ce6d8e044a2ea9f5cf06e930f6592488d982bcaa306391fe4\",\n" +
                "        \"c9ff2b642922d64299f5f02a0654d2abf05597bc91c1fa9d486d5e03527f642b\",\n" +
                "        \"62835c91d282be972282b9a54ca4f0567d8cea869d571ea2aa8f4ae935d4e8c2\",\n" +
                "        \"e93e2a320d713bcd44177d5073c40a7635c2921770c7417e81b37f9375122909\",\n" +
                "        \"fc0dd83d01b1a32a711fda1dfa3f378987ee9f759b9e36682dbc9588d49ddfb2\",\n" +
                "        \"e5e1f6dd65fa911dfe2c53622b40db1fdfddb5114af140d75a0f3848c26f0c24\",\n" +
                "        \"39fe4931a8abd9814bf441e987db935e3219b0bb38c81fc3f046d1286f1bacda\",\n" +
                "        \"2c7c2892c7a01ab3de20c4d91407bd42b8a4faa7df56495064c4c2196d2621a2\",\n" +
                "        \"dc426069a14673d60e69f59673d71b3eebb4e240baa5efbf701ad7fd7d54a907\",\n" +
                "        \"03de0eae292e31ed1169340c2df8dc32b4269f7009450f6c33121da575237435\",\n" +
                "        \"53eb9ad6634619ab5b8aea1a09a9fa23bbe6dc54b345e46e79cfefe98234b1af\",\n" +
                "        \"5f66e308be2176b6de13ec4dbabd865ddd9e8a4dfc071fab608e9f5310f62d50\",\n" +
                "        \"238e9c76f3049d67469477ce94ea4b3ebabe1a1d1e884b265afd13d49b854578\",\n" +
                "        \"6ee81c3db5b2de135860faf4ab71185ce8baed4d3816016c74285d7d5d104de3\",\n" +
                "        \"2d9847b998e51bb2bb10226c4318048b4dc5a2f23967423504d2863d101aa492\",\n" +
                "        \"5fd02ffd6063f83e26b08467c5f63f0b93e4d0e72b5308fe03fffcbb1024715e\",\n" +
                "        \"3d02083fc0b793ce8a76a57e91b5ed3a419e079369d074de398e12320de27325\",\n" +
                "        \"64ade781180c5df0f4b5db482cea9d0edac3a700db985eb18641a52424c12475\",\n" +
                "        \"b4236a7c223d46fa2f65c259159b91b8fc860930b320e2c088e9a049160e87ce\",\n" +
                "        \"9ea182c292e66defa2cb2b6b98d813f693016b5f9a6319a08731b52e597c86aa\",\n" +
                "        \"4797fa4180b17e13d973a75d7bbcf061a3a37b6a7b18c5f37970c9b098cedd97\",\n" +
                "        \"525d01ccdb4d8cf935f48a669438309c83a8f848c511b1e5c811b737e9634516\",\n" +
                "        \"27348d11417df1c86f82ae3c847a665f923586e16f7e8e610acd3fa0ca061b0d\",\n" +
                "        \"19be4ca5846b5da7c52a95689c3f10b2f4556f13b11eb9ead2e743fc6b17d992\",\n" +
                "        \"fdc5cb4b231fd13d09cb44a61833ef41d784d5c6387787d0769c9ee402b00162\",\n" +
                "        \"db736e48dfc06dd34702d9777b9cb5d7b410bc89498fd6bfc3c021114df80fd7\",\n" +
                "        \"07935cf2c8c6f1d9dc998ca19d3d49f9d7a449bc8168baec96edfb7cc6985763\",\n" +
                "        \"edd9e8a73b6f3a97c73fba2348630a94d2aff6dc35342f897c990134150ba9d1\",\n" +
                "        \"04e8c61a0654365d34ac96fc600b66720989f29e0e5bb8eb7bfd34305870014e\",\n" +
                "        \"6212808a9e09ac0506a414e71e7d0260619c83a6c2bc508fb64258d3ccdf15e9\",\n" +
                "        \"4f00612577c70d3974750d4bf53fb59861adab99cb726d4e4f88cc26bc2065df\",\n" +
                "        \"166d58321b5e39748a3ea9e3a0c74bdb3770d3676e6d0eb9c198051540ebce4f\",\n" +
                "        \"9d043c1d1e032ae4d37f2593c7dad997bfe00dfa56d46ee89d08b867878e63ec\",\n" +
                "        \"fdab757bcdfb1e2787d8b0e38f030bb806906de276ebd7e74d8991fe4a077224\",\n" +
                "        \"9031adb4d9d2bcfacacb39f7cce5c0c5a3235f7c7517b9b82aa7da88bed6daec\",\n" +
                "        \"3fecf0ffbc4e592c574d488734f11723363f65a268ecd73afb8116c8d603dcd2\",\n" +
                "        \"a812e2f097dc02062bbe9991758a6833ce9d2c62510fd7011132ad472ecb92ee\",\n" +
                "        \"1ffadd74fdda401b40626b6e5143fec2f55f5c6e769b97a81ac06c0cff2fb724\",\n" +
                "        \"6e540f040e1842d76364b37d11440e920dd0a8ad24a6e2c23a02a666070d0259\",\n" +
                "        \"20a8661662115e3c6e33cf90d90e154a77b7c8122ce0b6b19d44b623a633a157\",\n" +
                "        \"e374a243427e0ba35696ab5f408a48a283ceb03160b1605ba61ce0e14fe604be\",\n" +
                "        \"d6a75081385062200d58444ee022514464f73de7aefb05820a1e1871eb036e1a\",\n" +
                "        \"45d5a6836cbefc4edf8cf1b9f04060d0c34407f6ee1b6eadd6ca8bbaae7ad61b\",\n" +
                "        \"c048e98952eef4f0da2cf1e108cbb49ec959f77f5731562d5b0a8da69659ea23\",\n" +
                "        \"e03f397538fb09e5e16da4d1bfa7892138a020e62565e3a034a399e366cb4e5c\",\n" +
                "        \"ad1a02e5866a0e1638dcd298ea0b22ce2a8e24d1081bff32dced9b01aca8aecd\",\n" +
                "        \"addf493a92c5fcd6c761b7401aff5cacf00c88d7d435fe6b4ea759255a5e49a6\",\n" +
                "        \"d7fea2fd9c67eb413700c433f5215211209951921fc57720538cfed89043c92d\",\n" +
                "        \"3cc19937d487f16dd22ec52646f14ccf147b5d507769ac7d06f45e0c6188332f\",\n" +
                "        \"b89c373ba6b2cf2f93c98ffbee3538295bf82d47a643a1a482b095c5f2a9ca33\",\n" +
                "        \"c10170d0513555625fa8a950f630c27139115dbbe63dd77a41f70c81adfc5cca\",\n" +
                "        \"cb098f96de692c701734edd0e5c244337a9072aee1b7d7b54558208c54bd4049\",\n" +
                "        \"5aaea158a6c19e005146e8b334a07da3c4c3d9e7bc926340a5ba568f363e3e4d\",\n" +
                "        \"9c4d3b7c42f11c6562f4da0e01bc3f2ce61a4f9c724527ffa302297af1a54a70\",\n" +
                "        \"fce03bd900e7ed44798a937fd3708699218636cb0158a1ef5eda3c5b9dfc8f1a\",\n" +
                "        \"fc43275850313703106c3d8ec7bd58fdd9e5f2e02b8702b58586e6c23200a2e1\",\n" +
                "        \"3328ab0beff018bac5df0e34474dde21fe997c4c9702da08d89b90fdb4f92c8a\",\n" +
                "        \"1018a3a98de355a903c339ad3674a1b4f08388950ecabdbfdc363f622b99196a\",\n" +
                "        \"21b14a8bfb485d3df4b6c551c87496946babadb643d46dd4a5bf4a8daaf023ea\",\n" +
                "        \"1cc0ebbb1a2222350389f6be7f3d2ed9ebcfd07d8c2dec23b3932245a16e21fb\",\n" +
                "        \"3de763b2f3516f31c1a025f4ae78db2bbefc83b694cdb1f3c3888e9a1e030341\",\n" +
                "        \"81cd4ba18315c0bd39a54a7ad8c6e797473c1542ac96b456de25baf70310e81f\",\n" +
                "        \"168f879c7f5264ed601080c67c697de14118aa25d9d235b4c6a5d5d07d597929\",\n" +
                "        \"ca7c22ff4c8a5206b41d02ee0a25dc2896f14310dda03c3c4dd7398f250accfb\",\n" +
                "        \"57d79348f1298b93c41c133c4a7d92edb89df4c4795bcebef2be091258f1ad77\",\n" +
                "        \"25c8db2791d44d52cf7233a70f1d2bb88dfd06bbdc5ece4a99dffd1fea5bbbb4\",\n" +
                "        \"bb01b380048c43f6c3a505bb1de36e3e97f92dd933d35ed28b3a400f92deff31\",\n" +
                "        \"6ef156d6424fe8567a4c0aebb67b95742ab32f8dd419d807cdae4131c8d3fde6\",\n" +
                "        \"646eee6505c47d0c921179729c958ee6bea62a286e4325a86f96aa61e173ba04\",\n" +
                "        \"a08d4750086549dd992565bd07c79a0e380a4b3ed7dddf789708020b51733c3e\",\n" +
                "        \"4760c750df7f296ae73fcc7fbc3713f71f411c80f1fb99c020fe02b019966164\",\n" +
                "        \"4643033849e2a7c884544b2e85df1a1b43537ffab305b62f8066e318cdbb6026\",\n" +
                "        \"ddc9c1cee5ec667e79094ecb5712fd4175d3df56d4491ff292f2ce532c8963ea\",\n" +
                "        \"b96b3d7b7cb36ee2e7062e1cf0d6533c7a84f6187b2b3406ea144c78269c297f\",\n" +
                "        \"51c1256b0bbb36a5551a55bee9671ff6b13e2aecb33492eed7a68d497539f129\",\n" +
                "        \"29c59ec39fc19afd84d928272b3290bbe54558f7b51f75feb858b005dea49c10\",\n" +
                "        \"8ecae265d9de1aa01d0a2bdbecd1730244a72a3bf67e14800080d129d41c1cf7\",\n" +
                "        \"8f4d7ba0812505ab91f7a684932bf3e997ed220b11893c46e6164606d5f67f88\",\n" +
                "        \"d6a90299480c39dc27fe31219597e5a5a681145068887dee5833bcbec953c9d9\",\n" +
                "        \"735c166e5fb70cc4124816338ced7a6ee5eeed3353030e413eab912fad16b3b8\",\n" +
                "        \"208e57c5d74b296d4a1de48af3285031a65abbb2faf85b74ca1ba8dd5d03fc22\",\n" +
                "        \"19529526736b33ec514a3fcffdf3a2a128dd109b87808a0350e39851d2055f7d\",\n" +
                "        \"fbab1f505da342614c2f0e0dde0c7ea84279789c98c1bd7cfe0112742b493f43\",\n" +
                "        \"4b54eb903b1b3652954e85e3b7e4fbf46a9cddd7793a7399687e29d1f2277d4b\",\n" +
                "        \"516b5b0d85402fb253e0b559a756824c58291c94e77ce7105ce701ca1417f098\",\n" +
                "        \"e68986bf8a5d04478822cd6eef5ad2f1950f002266304415daee580f3e9afd03\",\n" +
                "        \"97654cd563ad28ca4bc7d0cb0a0b903c6716b7d605b2518483d2a55d9c7d4c29\",\n" +
                "        \"b4035cb769a48c6ca6d1cd30a957146e8cb5e7b3a2b942de17f95db958562f08\",\n" +
                "        \"29ac0eca5095bcca3f9029906dfb15239e87a10bfba9fb3acc426059b9722f6a\",\n" +
                "        \"4e48485a74d16010688fb9f9d10ea03c0ef520680504bb36f51a354adc5ae7f8\",\n" +
                "        \"ae1ec4d95b3305be6f144f5664997bc82500d6d007e64c19931f920c98ee116a\",\n" +
                "        \"54ddbfd6d631452285fa9c6ef619d1958e0b1e98cd6ba026408e19e1f9ad3407\",\n" +
                "        \"039d4bc5bf6b28e0f2b5b7de79b4ccd0f0ef121119f54c4153b6784694f633db\",\n" +
                "        \"c877ba388026bde5384b7686772007cdca441628d8575a812a387736b1e08764\",\n" +
                "        \"bfccc1d9e2b107d6e1a02e332fe5a2797e828d2ad1a318e3a71278b9bf11fea4\",\n" +
                "        \"32273d84226e55382a212ebed2647957dfcabd3bb4759b2370129cdff28da347\",\n" +
                "        \"c71a23b31c7688d7a0b890fc9e7b80da9bbbf9d041add515aa878877d3ff2bcf\",\n" +
                "        \"aee9cf2bf34e8932e0dab1e96179d885f76ff80a424d1050f945f2e22f75c08e\",\n" +
                "        \"c326e9d832a27bed2e59d26a74170d8ad624e5fe4a4d10554f1ca7052cbdd869\",\n" +
                "        \"1fdbb50d7815e6229b94f5f430eeecbdf05a2c99404132b377c759b0071cd18d\",\n" +
                "        \"51978bec5ead349145f9e86d9aaab4570421904d85fed07046222899aeeaf27b\",\n" +
                "        \"bb0a18d4e0284908f1e862ffe146938f5648d5ba7d998234dee97096c016d97d\",\n" +
                "        \"d169f8c2d0db292d6abeadb8e08805dc3b916deebfc45e2d609f33a60ffdab23\",\n" +
                "        \"247155b3d426989d4fd4af721e2c65f0d7a29c213c118bbe946d1d40e626ff4a\",\n" +
                "        \"c12ef1115d7fdd7867bc49d209dfd5e3b0cd83dec173ca6ed38d18c5efc85297\",\n" +
                "        \"0a8d8e8d89bcdb9abf4e2948f6e09e99da9af14fb7006beae771a705ce40c90c\",\n" +
                "        \"91a070c33fa4831fa5a4291e39665e06350e15c0471762cb0faf6f4703047860\",\n" +
                "        \"218a56a440794ed9e2f70a7b664c9f332f33bb3156e0e39e94ef9d9089ed5186\",\n" +
                "        \"2d4301e27fedb92b75ca8a6122f0b65f99c6f6a0a6c656b6ecd968100b57afbe\",\n" +
                "        \"17a10aa4741291708c2041b5577d4d143abfd5e3009d7b2d2689ac0ce43eb1ab\",\n" +
                "        \"df9e0b75e078de1b8cb79e150d1e28d62d73446ee527859fa3f3883b72be4d5d\",\n" +
                "        \"30ad43e810b5cb927ea03cb9af4c4197a2dbce180f3f4f3a00ccab85df8f31dc\",\n" +
                "        \"f861d9f6a96fb9f11734a1804b062f4b9f04780cbb643ac3d266f71431cd0833\",\n" +
                "        \"5fabbd1cd0dc36ffe6ed11ca6bd990dc3c26409bee7a393526299d20815b4d95\",\n" +
                "        \"df7db639ec0764972530f043339e77efcb70e188e1532018629bb80fd8b78b57\",\n" +
                "        \"cd34de55674412c60526c155ce7d494a7368fa8600475464269b3c010a3a7586\",\n" +
                "        \"58e05c93d9106294b838c8f78f463684b3dac7dded47e59023b9092deac913da\",\n" +
                "        \"4ac88c59a4bbeffd1a451c6b967acf842c199ced7fd3f27f52e8dbf435068817\",\n" +
                "        \"92c18ffd4c1b3c5374a614641f767eb5ac52b0bcb35c9807b2f96d414acae4b8\",\n" +
                "        \"89837ab8c8e7c80f46498367a46b473e089924b3d491e8ffe888450a13494e6d\",\n" +
                "        \"9b9624a8f4e0af028e56b78b19507db1eae120b5e1cf72f5594e25151a229bac\",\n" +
                "        \"e7537d1003a90d360515e6c4573234e634468ab8dcfd4e3e16dfda422a3af164\",\n" +
                "        \"c1476b6c68cbc7e722671ae4e71ab1a71613e4ffe0a4a2054314f4a71f2d4620\",\n" +
                "        \"f4d3a889b81784663bcb072c851805212b9782ed67efb3896b5f50b6e740a080\",\n" +
                "        \"14e53c81a045c959fc82294f960c789d2f43dca6aaa187c7cb49054e476ee598\",\n" +
                "        \"5e329654f05d5871c5b90702d176117d8283e4cf2ce6e359c132d52d0538c655\",\n" +
                "        \"4d19844cf24d410ab948c6c5100a1e3ab729584ae6f4939fbe4cdbbee947b6cb\",\n" +
                "        \"e178a9876c17b3dd8cebe869f710eb75154d08bff86a257a117ceb2520760647\",\n" +
                "        \"477da0ceaf2d364461178cddafad5770e5ac66f2e258ac93149e81a1a1780dd7\",\n" +
                "        \"1b1702cc710ef9f5c0b3170fb63f220f3cf49996c5be68e75b704fc0245c1978\",\n" +
                "        \"8b75dd7d4c79e0762de4e542658e1f3759d05571ff7887d6b130ca569024858a\",\n" +
                "        \"248c721d34323ff08a1be8152d48b7f11626ccf6badde9e06b171ec9ea2c0ccf\",\n" +
                "        \"c46bf8cf849cce3a45a972aa2f1140c149728eb45d61dfdbb03a35dead91c30f\",\n" +
                "        \"0a2846470b00ab7ae40cbdd586ebf8ba101cb3e4553a70cbd2bb3fb9723e6bf6\",\n" +
                "        \"38feab8af2e77a295d49452c315be43e4862faa9200c2c3531e48d1cf8ea5201\",\n" +
                "        \"8269a2beb72b6ed3f324dfe9cca315bd17d3c505f9234254cf2429d66a621c80\",\n" +
                "        \"60793fe6188b506865fe5f864587de86b5d381d86a1cfdc26da0961bd33ae6f0\",\n" +
                "        \"65fbf3aa10217d13c1acd17a8624b4a653bbd5c86d3901af932adab7e4cf4780\",\n" +
                "        \"b7b3b90dfd7a829a514f1b2c0d36b61a696c30a11ef2847ed346b1238000eb10\",\n" +
                "        \"523f6e6a8485101e073a6698e19a1781e464456aa492c5e8f8016e70a0edff78\",\n" +
                "        \"45de7e87f9580af5ac605ba8ec2173c9ba7a0804ebc2955894c3038ae73c4ad6\",\n" +
                "        \"a820f06fcbd08d02cf3efce53dcd57731891febf691a9f783232fd0e9a12232d\",\n" +
                "        \"bf10cf40b52522c13556d47ec8874e8445bc36b5b8e9c26fa919db3b8e7008a9\",\n" +
                "        \"2c37ab33e325926aef60c48bcfe41b69d1003732d25673893fd38e7ad7bdd9f3\",\n" +
                "        \"82f821de11e2a124e16e3749c99abbfb8ee9597a6089f4aea5b506e974e4c959\",\n" +
                "        \"cf0520e41b97fdcef75a719a42a67af3d6c36f0921ce5e79deac757673bf2c2f\",\n" +
                "        \"1595e6b0019c1ec35d8ff161e911a59c956473f5a27ee319d647901d99739968\",\n" +
                "        \"0ce955dc614c076565d759f9d4e58ec1afcb119aa636283b8de362c0b7bd4b4c\",\n" +
                "        \"219d1a9a6eba599dd76e9a469914bcbc3a7ab2e89f043ec671cc310072199ae7\",\n" +
                "        \"5ac75a6111c769c4565adfa9f6a8e23fafd01f3e61b30078704c332ed9cc164b\",\n" +
                "        \"4695f64db8eb58e89907e8af59ca804d3099befdce07aaa9193955ad2471f324\",\n" +
                "        \"4b2d72e0dbbbd97c9cd69f451fe5929ecee320ab57fc5a276112f9d01f5f5121\",\n" +
                "        \"a137c955cc0cb37899a6da7ea742363a9a5d61affbd166ab281f80ccf745557f\",\n" +
                "        \"1f540bb382b6fb39f023acf2d8207303a441f3507ab73e85b03f7e20917c2294\",\n" +
                "        \"212b3a29b17e3b0979e350f0400e9032c1a64ad2e012a11993e2067138452c65\",\n" +
                "        \"5fc7edf35b1ab35f5bdc3dda6a8ea392ebad9ebd709174a3fa7294afb712868e\",\n" +
                "        \"de84468c5b3a140296dfc5d2a4bcdddd85f72c23f052fd9cd1fa4e411482b76e\",\n" +
                "        \"4f5a1be4b7ceb713f65472e2bd23dd014c63a472beed07e8266f50cb07fe2938\",\n" +
                "        \"839deaa02c3df90a756e919eac6084d3666867784b6f88d8b19881d03ae77d2d\",\n" +
                "        \"a097193fb490ca31814684af393c6c4f5f74203ac18e039d2ee7444449658656\",\n" +
                "        \"5a7397fb7f3e7f222dd9afc7d1351f024681b97722cce8a6c34e230cd683931f\",\n" +
                "        \"f0c42830dc8dc24ca477af3ff0352e3d1e8cc2f7679b47ee61d2910722f1c35b\",\n" +
                "        \"c4d079ad4d7a2fe9e311e76c6995f6c324919276c6014047caa4493b7a4ec046\",\n" +
                "        \"6f0def0569bfdafd0d3600acfad12bd5450c5b7e023c17c96245d26018e6e564\",\n" +
                "        \"5f0ba9985eedcc5c22dded7fcd6fc1f56431f25713f356de6d478bf0ea76d660\",\n" +
                "        \"acbb11b94d3141905d4571a263ad9d8d34ce188e867802b9ac36a33df264a863\",\n" +
                "        \"6c493e52acaef4cb45b22f56d64b488c60975a0e763f99cabedbfced9026c310\",\n" +
                "        \"37e2732e734184e7d83fc357efff339b21dd1b7b49c8c925861badbc9d78a4b4\",\n" +
                "        \"fe0bc2d3e7f1862b5c26d76d1ad2c567879ef50eadd06fe5c9048038f252a9f5\",\n" +
                "        \"86ee5055fd9d5b53b6e9c387ab04d62436e4617e78441c9b5ac0d4e50d502af1\",\n" +
                "        \"1f950b76601d2b26d65d43aa069b33699fe16e06e0d67353e0efd86a68774dbe\",\n" +
                "        \"cb4c1890761ac8154679ae59a566d3284555dd513eed7393169c6b4bdb4c1697\",\n" +
                "        \"22381f5ee49c663ebd1606f7e3534f7868a9646f487962a9699c409460ee59f9\",\n" +
                "        \"9d463475e5b8e3fd0cbc1c64dddd0b49d8f03445ea7008f2b0be973de217e791\",\n" +
                "        \"2f144502c5ebcf1d06ffbb46fbfb043706a2807fc04c8456daa905c388a9da66\",\n" +
                "        \"1258388cbbcd2e3a55ab4e69b6506ee7b52a3f4d7338503215f31999f3c7a0ab\",\n" +
                "        \"705d253cf93067d88f1e394f137dd989aa2409ba43f97dd13538cb74cf6d431f\",\n" +
                "        \"9e9459170e9fc2b81d2b894fe02ee4a753a45942b3d565bca66808877dd31419\",\n" +
                "        \"9d4c6e423e9cf0622a6358eac3b2ba167957708edc369ba5a395d8eb9bcc429f\",\n" +
                "        \"59a2f70ae95dafc5ed940ce796310424e5cd8e40c408158aa5886de533fefbd4\",\n" +
                "        \"d10c2cc0349db615bf15e19d47e06f01f355f3bbaa8355888bb4c2235b3d4a02\",\n" +
                "        \"8f56f65295654cde3842a8e545633c45ead57abd7505c24e7a7d7897640d6e23\",\n" +
                "        \"f534791385b6a66972ce52c3f37dcf245130857b411bbfb62aca511862143f43\",\n" +
                "        \"fbab867aa2b99fa2c987892a610b9cc6931f2602362b2ba6b5de3a7d0495a588\",\n" +
                "        \"481e8e305a99b08d3350b51f2b76f91ebfff6c9337cae7d1a26cd8a5bc8a8c87\",\n" +
                "        \"80de528346cec9ac6cd0cd1d24db1a53235f051d842528da387324dd3fbb8fa0\",\n" +
                "        \"550e82d8b6e589a609db254bf0d0c17b8bdd8689bbb4f304953ef37fa5a8d408\",\n" +
                "        \"1843e9cecddc3bd7860bdf573e584d45a5400c46bbe9a1dde1c56aaa7f49e463\",\n" +
                "        \"8b6d78a047f4b235d05cab54134aa9434109f6a55f55273cdf8b5c7ae939b708\",\n" +
                "        \"85cc52170fe8170f0bca8f3d57eb382fa948993f15c08292083f1ea73f1156a6\",\n" +
                "        \"18c4556c5448eb0dc847217bcccf69fad5c91110ca85ad3ee5f74a13947701dd\",\n" +
                "        \"b893db7b87a09dc709717d92bf3fdb7ecd4ec82686ae25ae20462e8c3ef4ac91\",\n" +
                "        \"bf90a63814cb6285b7951aaf77ba0d807ba243aacd9617bc9ffb8a4ad45b330a\",\n" +
                "        \"6ce613248d970771b68e63678b7926a971e173d26aceec029c27c924670ea3fe\",\n" +
                "        \"849c7489d9660f2b6005d7bb8c0e36865e3d80c1f93020fdd5cf0c41ee3c4612\",\n" +
                "        \"c0e2c07568ce3aa6f2608fccfba3f6745e5f947f3d7fc0e19440b0e310c4bd19\",\n" +
                "        \"f95bfe21092d9e789444ab24b5392ea7e453e5fe99637e1a9f440d71d10273bc\",\n" +
                "        \"ba1538b6cbda326541dd41ad0eaa1b22f21f8c9804828edd8308daa9227e9fb1\",\n" +
                "        \"fb3a931e46e841310c97b4294759da7e10022783f271893386ea116809df8c5d\",\n" +
                "        \"a167568bb1e3e09f971694ae98de98a096f1f380530a290ad17587e1bf1426e2\",\n" +
                "        \"37f74cd256eacb7ee6d43f2548e845dc717be5c6da83923418bb20e80dc483cd\",\n" +
                "        \"d27b593df53fe2d417724bc030e8a2c62a94ab54733897174b742f58b0627766\",\n" +
                "        \"6094b5cffdb7d7519d6030f63c2c44a811aa59810a90ed16fd38608239e798ca\",\n" +
                "        \"0ce4c26a968455430de6c6166a327753a82024f194961b32e2fc404eedf93a9e\",\n" +
                "        \"9bfc5331f54e4c46372d11ab0149230f59bfc8ec04af5107c78c87129b116553\",\n" +
                "        \"44c914d0529d1e55492790b6e11c79e0574088a1de323d9634d4f1f199e603ea\",\n" +
                "        \"7ec60e74d9ca608fb8d5bad60fe3fb0a9a21037a153a74cdebd3c4af3eef6aa9\",\n" +
                "        \"a6a1fc955d82702f92ed10757da6f2e08afd23da27a879243275bccab867d7fe\"\n" +
                "    ]\n" +
                "}";

        // Create new address from JSON
        Address address = new Address(json);

        // Check that all fields were set correctly
        assertEquals("19SokJG7fgk8iTjemJ2obfMj14FM16nqzj", address.getAddressStr());
        assertEquals(0, address.getBalance(), DELTA);
        assertEquals(0, address.getBalanceSat());
        assertEquals(112.91089695, address.getTotalReceived(), DELTA);
        assertEquals(11291089695L, address.getTotalReceivedSat());
        assertEquals(112.91089695, address.getTotalSent(), DELTA);
        assertEquals(11291089695L, address.getTotalSentSat());
        assertEquals(0, address.getUnconfirmedBalance(), DELTA);
        assertEquals(0, address.getUnconfirmedBalanceSat());
        assertEquals(0, address.getNumberOfUnconfirmedTransactionAppearances());
        assertEquals(364, address.getNumberOfTransactionAppearances());
        assertEquals(364, address.getTransactions().size());
        assertTrue(address.getTransactions().contains("a2afb522edeba67ae593c683154da45b231d59ffccd18806cec38ecd21994a2d"));
        assertTrue(address.getTransactions().contains("c1b579ea24a1e392cc28b05db24b7ce84d31ec5e165fa9dcca2bcaf2964171aa"));
        assertTrue(address.getTransactions().contains("a6a1fc955d82702f92ed10757da6f2e08afd23da27a879243275bccab867d7fe"));
    }
}