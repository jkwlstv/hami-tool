package hami.tool.all;

import hami.tool.core.Tools;
import hami.tool.crypto.CryptoTool;
import hami.tool.http.HttpTool;
import hami.tool.json.JSONTool;
import hami.tool.list.ListTool;
import hami.tool.map.MapTool;
import hami.tool.str.StrTool;

public class AllTool {
  public static void main(String[] args) {
    Tools.hello();
    CryptoTool.hello();
    HttpTool.hello();
    JSONTool.hello();
    ListTool.hello();
    MapTool.hello();
    StrTool.hello();
  }
}
