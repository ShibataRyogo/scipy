public class BFSTester {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("使用法：java BFSTester 読み込み対象ファイル 始点 終点");
            System.out.println("例：java BFSTester graph001.txt 0 200");
            System.exit(0);
        }
        String filename = args[0];
        int start = Integer.parseInt(args[1]);
        int end = Integer.parseInt(args[2]);
        BFSTree bfstree = new BFSTree(filename);
        int[] path = bfstree.getShortestPath(start, end);
        System.out.println("BFS Tree: root = " + start);
        System.out.println("Shortest Path " + start + " -> " + end);
        for (int i = 0; i < path.length - 1; i++) {
            System.out.print(path[i] + "->");
        }
        System.out.println(path[path.length - 1]);
        System.out.println("経路長：" + (path.length - 1));
    }
}