let pkgs = import <nixpkgs> {};

in pkgs.stdenv.mkDerivation rec {
  name = "HomeAutomationServer";

  buildInputs = with pkgs; [
    leiningen
  ];
}
