let pkgs = import <nixpkgs> {};

in pkgs.stdenv.mkDerivation rec {
  name = "daikin-lircd-generator";

  buildInputs = with pkgs; [
    leiningen
  ];
}
